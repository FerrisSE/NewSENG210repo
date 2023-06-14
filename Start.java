import java.util.Scanner;
public class Start {

	public static void main(String[] args) {
		//objects
		Scanner scnr = new Scanner(System.in);
		
		//variables
		int userInput;
		
		
		System.out.println("Welcome to Joey's Pizza! What can we make for you?");
		System.out.println("Type a number to choose:\n 1.Pizza \n 2.Pasta \n 3.Subs");
		userInput = scnr.nextInt();
		
		
		if (userInput == 1) {
			//FIXME add what happens when customer selects an option
			System.out.println("Choose what Pizza you'd like! \n 1. Cheese \n 2. Pepparoni \n 3. Custom");
			userInput = scnr.nextInt();
		}
		else if (userInput == 2) {
			//FIXME add what happens when customer selects an option
			System.out.println("Choose what Pasta you'd like! \n 1. Chicken Alfredo \n 2. Veggie \n 3. Cheesy Alfredo");
			userInput = scnr.nextInt();
		}
		else if (userInput == 3) {
			//FIXME add what happens when customer selects an option
			System.out.println("Choose what Sub you'd like! \n 1. Italian \n 2. Vegetarian \n 3. Custom");
			userInput = scnr.nextInt();
		}
		else {
			
		}
	}

}
