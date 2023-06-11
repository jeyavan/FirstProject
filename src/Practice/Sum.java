package Practice;

import java.util.Scanner;

class Sum{
	public static void main(String[] args) {
	   
        int number = 0;
		int sum = 0;
		//int a=number*sum;
        try (// creates an object of Scanner class
		Scanner input = new Scanner(System.in)) {
			do {

			    // takes input from the user
			    System.out.print("Enter a number: ");
			    number =input.nextInt();
			    //sum -=number;
			    sum += number;
			} while (number !=0);  // test expression
		}

        System.out.println("sum = " + sum);
    }
}
