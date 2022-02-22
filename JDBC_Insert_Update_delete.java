package edureka.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBC_Insert_Update_delete {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysq.jdbc.Driver");
		System.out.println("Driver loaded...");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/edureka","root","edureka123");
		System.out.println("Connected to the database...");
		
		Statement st = con.createStatement();
		
		System.out.println("Before creating the table...");
		st.execute("CREATE TABLE 'student1' ('id' INT(11) NULL DEFAULT NULL, 'name' VARCHAR(25) NULL DEFAULT NULL, 'marks' INT(11) NULL DEFAULT NULL)");
		System.out.println("Table Created...");
		
		st.executeUpdate("insert into student1 values(2, 'John','M.Tech', 98)");
		System.out.println("Row inserted");
		st.executeUpdate("insert into student1 values(3, 'Sayanora', 'B.Tech',96");
		
		
		st.executeUpdate("update student1 set name =John Matthew', where name = 'John'");
		System.out.println("row updated");
		
		st.executeUpdate("delete from student1 where name = 'Sayanora'");
	

	}

}
