package Training;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		
	
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Employee Name");
    

    String empName = myObj.nextLine();  // Read user input
    System.out.println("Enter Salary");
    double salary = myObj.nextDouble();
    System.out.println("Employee Name is: " + empName);  // Output user input
    System.out.println("Salary is : " +salary);


	}

}
