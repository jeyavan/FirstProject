package Training;

public class TestOops {

	public static void main(String[] args) {
		
		OopsExample sriObj = new OopsExample();
		OopsExample alyObj = new OopsExample();
		Welcome nivObj = new Welcome();
		
		System.out.println(sriObj.name);
		sriObj.x = 100;
		sriObj.a = 500; 
		System.out.println(sriObj.x);
		System.out.println(sriObj.a);
		System.out.println(alyObj.y);
		System.out.println(nivObj.abc);

	}

}
