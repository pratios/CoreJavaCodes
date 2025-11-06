package JDBC;
import java.sql.*;
import java.util.Scanner;

public class DBConnectivity {

	Scanner sc = new Scanner(System.in);
	public void fetchStudent() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			Statement st = co.createStatement();
			ResultSet rs = st.executeQuery("select * from tblstudent;"); //only to set
			
			while(rs.next()) {
				int RollNo = rs.getInt("rollNo");
				String Name = rs.getString("name");
				float Eng = rs.getFloat("english");
				float math = rs.getFloat("maths");
				float sci = rs.getFloat("science");
				
				System.out.println(" "+RollNo+" "+Name+" "+Eng+" "+math+" "+sci+" ");
			}
			
		}catch(Exception e) {}	
	}
	
	public void UpdateTableStudent() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			Statement st = co.createStatement();
			//int cnt = st.executeUpdate("insert into tblstudent values(6,'Anas',45.6,77.6,88.7)");
			float p = 66.9f;
			int cnt = st.executeUpdate("update tblstudent set english="+p+" where rollNo=1");
//			st.executeUpdate("delete from tblstudent where rollNo=6");
//			if(cnt >0)
//				System.out.println("Query executed successfully.\n");
			
		}catch(Exception e) {}
	}
	
	public void UserAddingData() {
			try {	
				System.out.println("Enter roll no");
				int rn=sc.nextInt();
				System.out.println("Enter name");
				String n=sc.next();
				System.out.println("Enter english marks");
				float e =sc.nextFloat();
				System.out.println("Enter maths");
				float m =sc.nextFloat();
				System.out.println("Enter science");
				float s =sc.nextFloat();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			Statement st = co.createStatement();
			
//			System.out.println("Do you want to add data to the table?(y/n)");
//			char ch = sc.next().charAt(0);
			
//			if(ch=='y') {
//				System.out.println("Enter Roll number, Name, marks of english maths and science sequencially.");
//			
//				String n = sc.next();
//				float e =sc.nextFloat();
//				float m =sc.nextFloat();
//				float s =sc.nextFloat();
//				System.out.println(rn+n+e+m+s);
				int cnt = st.executeUpdate("insert into tblstudent values("+rn+",'"+n+"',"+e+","+m+","+s+")");
				if(cnt>0) {
					
					System.out.println("Record added successfully.\n");
				}
//			}
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
		
	
	public void paramiterised() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			PreparedStatement p=co.prepareStatement("insert into tblstudent (rollNo,name,english,maths,science) values(?,?,?,?,?)");
			
//			System.out.println("Do you want to add data to the table?(y/n)");
//			char ch = sc.next().charAt(0);
//			if(ch=='y') {
//				System.out.println("Enter Roll number, Name, marks of english maths and science sequencially.");
//				int rn=sc.nextInt();
//				String n = sc.next();
//				float e =sc.nextFloat();
//				float m =sc.nextFloat();
//				float s =sc.nextFloat();
//				System.out.println(rn+n+e+m+s);
			
			p.setInt(1, 10);
			p.setString(2, "ABC");
			p.setFloat(3, 77);
			p.setFloat(4, 67);
			p.setFloat(5, 89);
			int cnt=p.executeUpdate();
			
		}
		catch(Exception e) {
			
		}
	}
	
	public void ProcedureFunc() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			CallableStatement p=co.prepareCall("call sp_tblstudent (?,?,?,?,?,?)");
			
			p.setString(1, "delete");
			p.setInt(2, 12);
			p.setString(3, "ABC");
			p.setFloat(4, 67);
			p.setFloat(5, 89);
			p.setFloat(6, 77);
			int cnt=p.executeUpdate();
			if(cnt>0) {
				cnt=0;
				System.out.println("Record added successfully.\n");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnectivity ob = new DBConnectivity();
		//ob.UpdateTableStudent();
		ob.UserAddingData();
		//ob.paramiterised();
		//ob.ProcedureFunc();
		ob.fetchStudent();
	}

}
