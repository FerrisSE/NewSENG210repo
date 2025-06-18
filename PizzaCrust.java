import java.util.Scanner;

public class PizzaCrust {
	int crustPref;
	int userInput;// added a comment
	
	// Allows customer to choose their style of crust
	// Adding comment to test conflict
	private void chooseCrust() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("How would you like your crust? \n 1. Soft\n 2. Medium\n 3. Hard");
		userInput = scnr.nextInt();
		
		if(userInput == 1) {
			System.out.println("Soft crust it is then!");
			crustPref = userInput;
		}
		else if(userInput == 2) {
			System.out.println("Solid choice, medium crust coming right up.");
			crustPref = userInput;
		}
		else if(userInput == 3) {
			System.out.println("Crisp and crunchy! Can't go wrong with hard crust.");
			crustPref = userInput;
		}
		else {
			System.out.println("Not a valid input.");
		}
		
		//Adding comment
		//Another comment
		scnr.close();
		
	}
}
