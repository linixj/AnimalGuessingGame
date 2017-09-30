package AnimalGame;

public class AnimalGame {
    
	static Animal MOUSE = new Animal("a mouse");
	static Animal ELEPHANT = new Animal("an elephant");

	static Question ROOT = new Question("Is it bigger than a breadbox?");
	static PlayAgain AGAIN = new PlayAgain();
	
	static {                   //initialization routine to get to run
		ROOT.yes = ELEPHANT;
		ROOT.no = MOUSE;
		MOUSE.parent = ROOT;
		ELEPHANT.parent = ROOT;
	}
	
	private void playGame(){
    	YesNo res = ROOT.ask();
    	while(res != null){
    		res = res.ask();
    	}
    	System.out.println("Thanks for playing.");
    }
    
	public static void main(String[] args) {
		AnimalGame AG = new AnimalGame();
		AG.playGame();

	}

}
