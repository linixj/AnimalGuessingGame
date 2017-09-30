package AnimalGame;

public class PlayAgain extends YesNo{

	public PlayAgain() {
		super("Would you like to play again?");
		// TODO Auto-generated constructor stub
	}

	@Override
	public YesNo yn(boolean b) {
		return b ? AnimalGame.ROOT: null;
	}
    
	
	
	

}
