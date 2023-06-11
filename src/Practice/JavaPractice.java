package Practice;

public class JavaPractice {
	public int add(int a,int b) {
	
	int add=a+b;
	System.out.println("add value: "+add);
	return add;	
	}
	static int sub(int a,int b) {
	int sub=a-b;
	System.out.println("Sub value: "+sub);
	return sub;
	}
	public JavaPractice(String a) {
		System.out.println(a);
		
	}
    
	public static void main(String[] args) {
		JavaPractice j=new JavaPractice("Welcome");
		j.add(10,20);
		sub(20,30);
		

	}

}
