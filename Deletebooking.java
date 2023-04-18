package Example;
import java.sql.*;
import java.util.*;
public class Deletebooking {
	
	public void delete() {
		
		try {
			Connection con = DriverManager.getConnection(
		              "jdbc:mysql://localhost:3306/property",
		              "root",
		              "031103"
		            );
		
		Scanner DS = new Scanner(System.in);
		System.out.println("Enter Customer ID To delete : ");
		double D_ID = DS.nextDouble();
		
		Statement delete_table_stmt = con.createStatement();
		
		 String Delete_q = "DELETE FROM Customer WHERE ID = "+D_ID ;
		 delete_table_stmt.executeUpdate(Delete_q);
		 DS.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		 
		
	}
	
}
