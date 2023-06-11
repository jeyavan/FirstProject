package Practice;

public class ConstructorParameters{
    float d;
	float f;
	
	String namex;
	public ConstructorParameters(float x,float y) {
		d=x;
		f=y;
		System.out.println("Answer is:  "+x/y);
		
		
	}
	public ConstructorParameters(int h, int g,int z) {
	
		
		System.out.println("Total value is:");
		System.out.println(h*g+z);
		
		}
	public ConstructorParameters(String name ) {
		namex=name;
		System.out.println("Enter the name:");
		
	}
	
          
    public static void main(String[] args) {
    	ConstructorParameters obj=new ConstructorParameters(40,10);
    	System.out.println("D value is: "+obj.d);
    	System.out.println("F value is: "+obj.f);
    	System.out.println("*****************************");
    	ConstructorParameters obj1=new ConstructorParameters(34,24,10);
        ConstructorParameters obj2=new ConstructorParameters("phranav");
        System.out.println(obj2.namex);
        System.out.println(obj1.d);
        System.out.println(obj1.f);
		
	}
	
		
	}


