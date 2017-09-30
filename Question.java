package AnimalGame;

public class Question extends YesNo {

	public YesNo yes;
	public YesNo no;
	
	public Question(String question) {
		super(question);
	}

	@Override
	public YesNo yn(boolean b) {
		
		return b ? yes: no;
		
	}

}
