package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Updatebooking {

  public static void update() {
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/property",
        "root",
        "031103"
      );
      int choice;
      Statement Update_stmt = con.createStatement() ;
      Scanner US = new Scanner(System.in);
      

      System.out.println("Enter Booking ID to Update : ");
      double property_id = US.nextDouble();

      String Check_c = "Y";
      
      while (Check_c != "N" || Check_c != "n") {
        System.out.println("Enter What You want to update :-  ");
        System.out.println("1. Property Name");
        System.out.println("2. Property ID");
        System.out.println("3. Property Address ");
       

        System.out.println("Enter Your Choice : ");
        choice = US.nextInt();

        switch (choice) {
          case 1:
        	  System.out.println("Enter Property Name :");
        	  String property = US.next();
 
        	  
        	  String new_name_q = "UPDATE customer SET NAME = ' "+property+" ' WHERE ID = "+property_id;
        	  Update_stmt.executeUpdate(new_name_q);
        	  break;
        
          case 2:
        	  System.out.println("Enter New Booking ID :");
        	  double new_cono = US.nextDouble();
        	  String new_cono_q = "UPDATE customer SET ID_NO = "+ new_cono +" WHERE ID = "+property_id;
        	  Update_stmt.executeUpdate(new_cono_q);
        	  break;
          case 3:
        	  System.out.println("Enter New Address :");
        	  String new_address = US.next();
        	  String new_address_q = "UPDATE customer SET ADDRESS = '"+new_address+"' WHERE ID = "+property_id;
        	  Update_stmt.executeUpdate(new_address_q);
        	  break;
        
         default:
        	 System.out.println("Invalid Choice!");
        }
        
        System.out.println("Want to Update Anything Else!");
        Check_c = US.next();
        US.close();
      }
    } 
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
