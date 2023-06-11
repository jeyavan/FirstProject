package PracticeA;

public class GameRunner {
private Mario gameapp;                   //class name and object name

public GameRunner(Mario gameapp) {       //constructor
	this.gameapp=gameapp;
	
}
public void call() {                      //public method
	gameapp.up();
	gameapp.down();
	gameapp.left();
	gameapp.right();
	
}
	public static void main(String[] args) {
		

	}

}
