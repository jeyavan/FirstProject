package PracticeA;

public class SpringFrameworkDemo {

	public static void main(String[] args) {
		MathCalculator math=new MathCalculator();
		Calculator calobj=new Calculator(math);
		calobj.value();

	}

}
