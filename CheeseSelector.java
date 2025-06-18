
import java.util.ArrayList;
import java.util.Scanner;

public class CheeseSelector {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// List of offered cheeses
		String[] availableCheeses = { "mozzarella", "cheddar", "provolone", 
				"parmesan", "ricotta", "feta" };

		// List of used cheeses
		ArrayList<String> usedCheeses = new ArrayList<String>();

		boolean continueOrder = true;

		boolean validInput;

		// Initial menu
		System.out.println("Welcome to the cheese selector!");
		System.out.println("Please enter a type of cheese to add to your pizza:");
		System.out.println("Options: Mozzarella, cheddar, provolone, parmesan, ricotta, and feta (n to quit)");

		// Main loop to add cheeses
		while (continueOrder) {
			
			// Gets user input
			String userInput = scnr.nextLine();

			// Resets valid input
			validInput = false;
			
			// Exits if user input is the escape character
			if (userInput.equals("n")) {
				continueOrder = false;
				break;
			}

			// Checks if the user input is a supported type of cheese
			for (String currentCheese : availableCheeses) {
				if (userInput.equalsIgnoreCase(currentCheese)) {
					validInput = true;
					break;
				}
			}

			// Restarts loop if the cheese has already been picked
			if (usedCheeses.contains(userInput.toLowerCase())) {
				System.out.println("Input already entered, please try again!");
				continue;
			}
			
			// Restarts loop if invalid input
			if (!validInput) {
				System.out.println("Input is not a supported type of cheese, please try again!");
				continue;
			}

			// If input is valid, adds input to list of used cheeses
			usedCheeses.add(userInput.toLowerCase());
			System.out.println("You added " + userInput + "!");
			System.out.println("Input another cheese, or type \"n\" to finish");

		}

		// If any cheeses were added, prints used cheeses
		switch (usedCheeses.size()) {

		case 0:
			System.out.println("Ordering a pizza with no cheese!");
			break;

		case 1:
			System.out.println("Ordering a pizza with " + usedCheeses.get(0) + " cheese! Yum!");
			break;

		case 2:
			System.out.println(
					"Ordering a pizza with " + usedCheeses.get(0) 
					+ " and " + usedCheeses.get(1) + " cheese! Yum!");
			break;

		// 3 or greater cheeses
		default:
			System.out.print("Ordering a pizza with ");

			for (int i = 0; i < usedCheeses.size() - 1; ++i) {
				System.out.print(usedCheeses.get(i) + ", ");
			}
			System.out.println("and " + usedCheeses.get(usedCheeses.size() - 1) + "!");
			System.out.println("That's a lot of cheese!");

		}

		scnr.close();

	}

}
