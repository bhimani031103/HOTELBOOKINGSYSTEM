package Example;
import java.sql.*;
import java.util.*;

public class Addbooking {
    public void add(){
        try {
            
            Connection con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/property",
              "root",
              "031103"
            );
      
      
            String create_student_database_q = "CREATE DATABASE IF NOT EXISTS Booking";
            String create_student_table_q =
              "CREATE TABLE IF NOT EXISTS property(Name VARCHAR(255) , ID INT  , ADDRESS VARCHAR(255) ,CONTACt_NO INT ) ";
            String select_db = "USE property";
      
            Statement create_table_stmt = con.createStatement();
            create_table_stmt.executeUpdate(create_student_database_q);
            create_table_stmt.executeUpdate(select_db);
            create_table_stmt.executeUpdate(create_student_table_q);
      
            try (Scanner AS = new Scanner(System.in)) {
              System.out.println("Enter  Name : ");
              String Name = AS.nextLine();

         
              System.out.println("Enter ID: ");
              double ID = AS.nextDouble();
   
             
   
              System.out.println("Enter Address : ");
              String S_Address = AS.next();
   
             
              System.out.println("Enter  Contact No : ");
              String contact_no = AS.next();
              
              String Add_data = "insert into property values ('"+ Name + "','"+ID +"','"+ S_Address + "' ,'" + contact_no +"')";
              create_table_stmt.executeUpdate(Add_data);
            }
            
          } catch (Exception e) {
            System.out.println(e);
          }
        }
    }
