package Practice;

public class WrapperClassObject {

	public static void main(String[] args) {
		//wrapper class  =Integer,Double,Long,Character,Float
		   int a=100;
		   int b;
		   String price="250";
		   
	      Integer myInt = 6;
	    Double myDouble = 5.02d;
	    Long myLong=8798876876L;
	    String myStr="Nivedita";
	    Character myChar = 'B';
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
        System.out.println(myLong);
        System.out.println(myStr);
        
        String myString = myInt.toString();
	    System.out.println(myString.length());
	   
	    Long objlong=myLong.longValue();
	    System.out.println(objlong);
	    System.out.println("equalTo:");
	    System.out.println(objlong.equals(objlong));
	    
	    
	    //convert string to integer
	    a=Integer.parseInt(price);                 
	    b=a+100;
	    System.out.println("value is="+b);
	    
	    //convert integer to string 
	    String c;
	    c=Integer.valueOf(b).toString();
	    System.out.println("\nThe string is="+c);
	    
	   
	}

}
