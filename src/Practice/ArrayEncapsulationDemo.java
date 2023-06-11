package Practice;

public class ArrayEncapsulationDemo {

	public static void main(String[] args) {
		ArrayEncapsulation myArray=new ArrayEncapsulation();
		myArray.array="Ram Kumar";
		ArrayEncapsulation myArray1=new ArrayEncapsulation();
		myArray1.array="Banu";
		ArrayEncapsulation myArray2=new ArrayEncapsulation();
		myArray2.array="Sam";
		
		 System.out.println(myArray.getArray()+" "+myArray.getArray().length());
		 System.out.println(myArray1.getArray()+" "+myArray1.getArray().length());
		 System.out.println(myArray2.getArray()+" "+myArray2.getArray().length());

	}

}
