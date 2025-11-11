package JDBC;
import java.sql.*;
import java.util.Scanner;

public class StockHandling {
	Scanner sc = new Scanner(System.in);
	
	public void addingProducts() {
		
		int cnt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockhandling","root","Pratiksha");
//			Statement s = c.createStatement();
			
			System.out.println("A.Add data\nB.Delete data\nC.Exit");
			char ch = sc.next().charAt(0);
			
			
			switch(ch) {
			case 'A' :
				System.out.println("Enter product name and weight sequancially.");
				String pn = sc.next();
				float w = sc.nextFloat();
				int q=0;
				
				PreparedStatement p = c.prepareStatement("select * from products where prodName = ? and weight = ?");
				p.setString(1, pn);
				p.setFloat(2, w);
				ResultSet rs = p.executeQuery();
				
				if(rs.next()) {
					q = rs.getInt("quan");
					System.out.println("Quantity available : "+q);
				}else {
					System.out.println("Enter expDate(yyyy-mm-dd).");
					String input = sc.next();
					System.out.println("Enter product rate.");
					float r = sc.nextFloat();
					System.out.println("Enter product quantity.");
					q = sc.nextInt();
					Date exp = Date.valueOf(input);
					
					PreparedStatement ps = c.prepareStatement("insert into Products (prodName, weight, rate, quan, expDate) values(?,?,?,?,?)");
					ps.setString(1, pn);
					ps.setFloat(2, w);
					ps.setFloat(3, r);
					ps.setInt(4, q);
					ps.setDate(5, exp);
					cnt = ps.executeUpdate();
					
					if(cnt>0) {
						cnt =0 ;
						System.out.println("Record added successfully");
					}
					break;
				}
			case 'B':
				System.out.println("Enter product id to be deleted");
				int pid = sc.nextInt();
				
				p = c.prepareStatement("delete from products where prodId = ?");
				p.setInt(1, pid);
				cnt = p.executeUpdate();
				if(cnt>0) {
					cnt =0 ;
					System.out.println("Record deleted successfully");
				}
				break;
			case 'C':
				break;
			default:
				System.out.println("Choose again.");
				addingProducts();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public void fetchProducts() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockhandling","root","Pratiksha");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from products;"); 
			
			while(rs.next()) {
				int pId = rs.getInt("prodId");
				String pn = rs.getString("prodName");
				float w = rs.getFloat("weight");
				float r = rs.getFloat("rate");
				int q = rs.getInt("quan");
				Date exp = rs.getDate("expDate");
				
				System.out.println(" "+pId+" "+pn+" "+w+" "+r+" "+q+" "+exp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockHandling ob = new StockHandling();
//		ob.fetchProducts();
		ob.addingProducts();
	}

}
