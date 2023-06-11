package Practice;
class House{
	//public String name="Welcome to my home";
	public int numberoffloor=3;
	public void design() {
		System.out.println("Welcome to my home");
		
	}
	}
class GroundFloor extends House{
	public String housecolor="gray and yellow";
	public void design() {
	 System.out.println("GroundFloor has a guest room ");	
		
	}
}
	class FirstFloor extends House{
	public void design() {
		System.out.println("Firstfloor has a living hall");
		
	}
		
	}
class SecondFloor extends House{
	public void design() {
		System.out.println("SecondFloor has 3 bedrooms");
		
		}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		House home=new House();
	    House ground=new GroundFloor();
	    House first=new FirstFloor();
		House second=new SecondFloor();
		home.design();
		System.out.println("Number of floor: "+home.numberoffloor);
		ground.design();
		first.design();
		second.design();
		
	}

}
