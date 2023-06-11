package Practice;

public class Encapsulation {
	final int f=40;
	int g;
	private String name;    //declare the variable here
	final private int age=20;
	public double x;
	public Encapsulation(String firstname,int ages){  //using constructor
		
		} 
static void add(int a,int b) {              //static method
		
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	public Encapsulation() { //using constructor with Encapsulation
	
	
	}
	public String getMethod() {
	
	return name;	
	}
	public void setMethod(String a,String b) {
		this.name=a+b;
		
			}
	public Encapsulation(double y) {
		x=y;
		
	}
	public double getDivi() {
		return x;
		
	}
	public void setDivi(float a, float c) {
		this.x=a/c;
		
	}
	public void Mesg() {  //public method
		g=20;
		System.out.println("sub:\t");
		System.out.println(f-g);
	}
public static void main(String[] args) {
	add(20,30);
	
	  Encapsulation ec=new  Encapsulation ("Nivedita",30);
	 ec.Mesg();
	 ec.name="selvi";
	 //ec.age=30;
	 System.out.println("Name: "+ ec.name);
	 System.out.println("age: "+ec.age);
	 
	 Encapsulation ec2=new  Encapsulation();
	 ec2.name="Phranav"+" jey";
	 System.out.println("firstName&lastname: "+ec2.getMethod());
	
	
	 
	 Encapsulation ec3=new  Encapsulation();
	 ec3.x=20/15;
	 System.out.println("Divi: "+ec3.getDivi());
	
		
	}

}

