package JDBC;
import java.sql.*;

public class DBConnectivity {

	public void fetchStudent() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Pratiksha");
			Statement st = co.createStatement();
			ResultSet rs = st.executeQuery("select * from tblstudent;");
			
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
			int cnt = st.executeUpdate("insert into tblstudent values(6,'Anas',45.6,77.6,88.7)");
			
			if(cnt >0)
				System.out.println("Query executed successfully.\n");
			
		}catch(Exception e) {}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnectivity ob = new DBConnectivity();
		ob.UpdateTableStudent();
		ob.fetchStudent();
	}

}
