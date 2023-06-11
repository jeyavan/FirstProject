package Practice;
import java.util.LinkedList;

public class MyClassLinkedlist {
  public static void main(String[] args) {
    LinkedList<String> name = new LinkedList<String>();
    name.add("Nivedita");
    name.add("Lakshmi");
    name.add("Banu");
    name.add("Priya");
    name.addFirst("Jeyanthi");                                     
    name.addLast("Narmadha"); 
    System.out.println(name.removeFirst());                                                        
                                                                      
    name.removeLast();                                            
   System.out.println("get firstname: "+name.getFirst());
   System.out.println("get lastname: "+name.getLast());
    
    System.out.println(name);
    for(String i: name) {
    	System.out.println(i);
    }
  }
}
