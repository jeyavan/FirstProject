package Training;

import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.get(2));
	    cars.set(3, "Honda");
	    cars.remove(2);
	    System.out.println(cars);


	}

}
