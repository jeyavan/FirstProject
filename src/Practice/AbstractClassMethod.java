package Practice;

abstract class AbstractMethods {
	int a=10;
	int b=20;
abstract void math();
	
public void add() {
	System.out.println("ADD: "+ (a+b));
	

}
}
		
 class sub extends AbstractMethods{
		int a=20;
		int b=10;
		public void math() {
		System.out.println("sub:"+(a-b));	
			
		}

		}
 class mul extends  AbstractMethods{
	 int a=20;
	 int b=10;
	 public void math() {
	System.out.println("Mul: "+(a*b));	 
		 
	 }
	 
	 
 }
 
 public class AbstractClassMethod{

    public static void main(String[] args) {
		
    	AbstractMethods mysub=new sub();
		mysub.math();
		mysub.add();
		AbstractMethods mymul=new mul();
		mymul.math();
		mymul.add();     //we can access the abstract method from another class extends.
		                 //if it has abstract method , it should override the abstract method in extends class
		
		 
		 
			  
		  }

}


	
/*Abstraction
 * ->Abstract method(method having only declaration
 * ->Definition will be written in derived class
 * ->Abstract class(contains atleast one abstract method)
 * ->concrete class(class which doesn't contain any abstract method)
 * ->we cannot create for abstract class*/
 








                               