package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<Integer> array=new ArrayList<Integer>(); 
	array.add(12);
	array.add(3);
	array.add(10);
	array.add(5);                                  
	System.out.println(array.add(6));                                   //add the value here newly
	array.set(2, 20);                                                   //set the value here
	array.remove(3);                                                    //remove the value
	System.out.println(array);
	System.out.println("Get the value: "+array.get(1));                  //get the value 
	System.out.println("********************************");
	Collections.sort(array);                                              //Ascending order  
	for(int i: array) {
	System.out.println(i);
		
	}

}


}
