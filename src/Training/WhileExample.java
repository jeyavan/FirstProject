package Training;

public class WhileExample {

	public static void main(String[] args) {
		
		/*int i = 1;
		   
        while (i <= 20) {
            System.out.println("Line " + i);
            ++i;
        }*/
		
		int sum = 0, i = 100;
		   
        while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
            System.out.println("Sum = " + sum);
        }
	   
        



	}

}
