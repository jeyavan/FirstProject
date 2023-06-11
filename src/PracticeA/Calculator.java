package PracticeA;

public class Calculator {
 private  MathCalculator math;   //Calculator class tightly coupled with MathCalculator
 
 public Calculator(MathCalculator math) {
	 
	 this.math=math;
	 
	 
 }
 public void value() {
	 math.add();
	 math.sub();
	 math.mul();
	 
 }
	
	public static void main(String[] args) {
		
	}

}
