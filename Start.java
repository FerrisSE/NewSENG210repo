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
		
		//FIXME add what happens when customer selects an option
		if (userInput == 1) {
			System.out.println("One pizza coming up!");
		}
		else if (userInput == 2) {
			System.out.println("One pasta coming up!");
		}
		else if (userInput == 3) {
			System.out.println("One sub coming up!");
		}
		else {
			System.out.println("Invalid answer: please restart system. ");
		}
	}

}
