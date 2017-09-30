package AnimalGame;

import java.util.Scanner;

public abstract class YesNo {
    
	private String question;
	public static Scanner scanner = new Scanner(System.in);
	
	public YesNo(String question){
		this.question = question;
	}
	
	public YesNo ask(){
		System.out.println(question + " (Y or N)");
		boolean b = saidYes();
		return yn(b);
	}

	public abstract YesNo yn (boolean b);

	public static boolean saidYes() {
		String line = scanner.nextLine().trim();
		while (!line.startsWith("Y") && !line.startsWith("N")){
			System.out.println("Please enter Y or N.");
			line = scanner.nextLine().trim();
		}
		return line.startsWith("Y");
	}
	
	
}
