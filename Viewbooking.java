package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.* ;
public class Viewbooking {
	public void view() {
		try {
			Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/property",
			        "root",
			        "031103"
			      );
			Statement View_table_stmt = con.createStatement();
			String select_q = "SELECT * FROM property" ;
			ResultSet set = View_table_stmt.executeQuery(select_q);
			System.out.print(set);
			while(set.next()) {
				System.out.println();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
