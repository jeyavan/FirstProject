package PracticeA;

public class SpringFramwork {
	public static void main(String[] args) {
		Mario gameapp=new Mario();                       //first you create object for Mario class
		GameRunner run=new GameRunner( gameapp);          //second you create object for GameRunner class
		
       run.call();
      
	}

}
