package Example ;
import java.util.*;


public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	try {
    		
    		String Check_c_m = "N" ;
        	
        	while (Check_c_m != "Y" || Check_c_m != "y") {
        		
        		 int employee_choice = 0  ;
        	      
        	        try (Scanner c1 = new Scanner(System.in)) {
						System.out.println("1. Employee ");
						System.out.println("2. Customer ");
						System.out.print("Enter Your Choice : ");
						int init_choice = c1.nextInt();

						if (init_choice == 1) {
						    System.out.println("1. Book Room ");
						    System.out.println("2. Update Booking  ");
						    System.out.println("3. Delete Booking  ");
						    System.out.println("4. View Booking/s ");
						    System.out.print("Enter Your Choice : ");
						    employee_choice = c1.nextInt();
						}  
						
						if (init_choice == 2) {
						    System.out.println("1. View Booking  ");
						    System.out.println("2. Update Booking  ");
						    System.out.print("Enter Your Choice : ");
						}  

						if (employee_choice == 1){
						    Addbooking a = new Addbooking();
						    a.add();
						}

						if (employee_choice == 2){
						    Updatebooking.update();
						}
						
						if (employee_choice == 3){
						    Deletebooking d1 = new Deletebooking();
						    d1.delete();
						}
						
						if (employee_choice == 4){
						    Viewbooking v1 = new Viewbooking();
						    v1.view();
						}
						
						System.out.print("Do you Want to Exit ? ");
						Check_c_m = c1.next();
						break;
					}
        		
        	}
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    	
    }
}