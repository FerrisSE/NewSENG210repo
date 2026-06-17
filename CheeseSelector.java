import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CheeseSelector {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Random  rnd  = new Random();

		// List of offered cheeses
		String[] availableCheeses = { "mozzarella", "cheddar", "provolone", 
				"parmesan", "ricotta", "feta" };

		// List of used cheeses
		ArrayList<String> usedCheeses = new ArrayList<String>();
		//list of unused cheeses
		ArrayList<String> unusedCheeses = new ArrayList<String>();
		for (String cheese : availableCheeses) {
			unusedCheeses.add(cheese);
		}

		boolean continueOrder = true;

		boolean validInput;
		boolean isRandom;

		// Initial menu
		System.out.println("Welcome to the cheese selector!");
		System.out.println("Please enter a type of cheese to add to your pizza:");
		System.out.println("Options: Mozzarella, cheddar, provolone, parmesan, ricotta, feta, and random (n to quit)");

		// Main loop to add cheeses
		while (continueOrder) {
			
			// Gets user input
			String userInput = scnr.nextLine();

			// Resets valid input
			validInput = false;
			//resets random
			isRandom   = false;
			
			// Exits if user input is the escape character
			if (userInput.equals("n")) {
				continueOrder = false;
				break;
			}

			// Checks if the user input is a supported type of cheese or random
			if (userInput.equalsIgnoreCase("random")) {
				validInput = true;
				isRandom   = true;
			}
			else {
				for (String currentCheese : availableCheeses) {
					if (userInput.equalsIgnoreCase(currentCheese)) {
						validInput = true;
						isRandom   = false;
						break;
					}
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

			// If input is valid, either randomly picks cheese
			// or adds input to list of used cheeses
			if (isRandom) {
				int randomCheeseInd = rnd.nextInt(unusedCheeses.size());
				String randomCheese = unusedCheeses.get(randomCheeseInd);
				usedCheeses.add(randomCheese);
				unusedCheeses.remove(randomCheeseInd);
				System.out.println("You got " + randomCheese + "!");
			}
			else {
				usedCheeses.add(userInput.toLowerCase());
				if (unusedCheeses.contains(userInput.toLowerCase())) {
					unusedCheeses.remove(unusedCheeses.indexOf(userInput.toLowerCase()));
				}
				System.out.println("You added " + userInput + "!");
			}
			
			//if all cheeses have been added, go to ordering phase
			if (usedCheeses.size() == availableCheeses.length) {
				System.out.println("All available cheeses have been added");
				continueOrder = false;
			}
			else {
				System.out.println("Input another cheese, or type \"n\" to finish");
			}

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
