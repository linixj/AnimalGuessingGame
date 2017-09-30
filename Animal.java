package AnimalGame;

public class Animal extends YesNo {
     
	public String name;
	public Question parent;

	
	public Animal(String name){
    	  super("Is it " + name);
    	  this.name = name;
      }  
     

	@Override
	public YesNo yn(boolean b) {
		if (b){
			System.out.println("I win!");
			return AnimalGame.AGAIN;
		}
		
		System.out.println("I lose.");
		System.out.println("What was your animal? I was thinking of ...");
		Animal na = new Animal(scanner.nextLine().trim());
		System.out.println("What is a question that distinguish " + na.name + " from " + name + "?");
		Question nq = new Question(scanner.nextLine().trim());
		System.out.println("How would you answer that question for " + na.name + "?");
		boolean y = saidYes();
		
		if(y){
			nq.yes = na;
			nq.no = this;
		}else{
			nq.yes = this;
			nq.no = na;
		}
		
		if(parent.yes == this){
			parent.yes = nq;
		}else{
			parent.no = nq;
		}
		
		this.parent = nq;
		na.parent = nq;
		System.out.println("I think I have got it.");
		
		
		return AnimalGame.AGAIN;
	}
      
}
