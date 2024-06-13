import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// objects
		Scanner scnr = new Scanner(System.in);

		// variables
		int userInput;
		System.out.println("Welcome to Joey's Pizza! What can we make for you?");
		System.out.println("Type a number to choose:\n 1.Pizza \n 2.Pasta \n 3.Subs");
		userInput = scnr.nextInt();

		switch (userInput) {
			case 1:
				System.out.println("You have order a pizza");

				break;
			case 2:
				System.out.println("You have order Pasta");

				break;
			case 3:
				System.out.println("You have order a subsandwhich");

				break;
			default:
				System.out.println("That was not an option goodbye");
				break;
		}

	}

}
