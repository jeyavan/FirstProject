package Practice;

public class Student {

	public static void main(String[] args) {
		String collegeName="shanmuganathan";
		String studentfullName="Ashok krishna";
		int studentID=234;
		long mobile=2405810485L;
		float collegeFee=4786.9890f;
		double otherExpenses=255.59d; 
		float collegeBus=76.20f;
		String address="5,perumal kovil";
		double anualExpenses=(collegeFee+otherExpenses+collegeBus)*12;
		System.out.println("Enter the collegename: "+collegeName.toUpperCase());//use this function in non primitive datatypes if you want uppercase
		System.out.println("Enter the studentfullname: "+studentfullName);
		System.out.println("Enter the student ID: " +studentID );
		System.out.println("Enter the student mobile number: "+ mobile);
		System.out.println("Enter the collegefee: " +collegeFee);
		System.out.println("Enter the otherexpenses: "+otherExpenses);
		System.out.println("Enter the collegebusfee: " +collegeBus);
		System.out.println("Enter the adress: "+address);
		System.out.println("Enter the anualExpenses: "+anualExpenses);
		
		
		}

}
