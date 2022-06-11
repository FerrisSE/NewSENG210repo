//Adding new feature to make unlimited pizza!!!

import java.util.Scanner;

class PizzaSlicer{

	public static void main(String [] args){
		System.out.println("How would you like your pizza sliced??");

		Scanner myscanner = new Scanner(System.in);

		String text = myscanner.nextLine();
		System.out.println("You chose: " + text + " slicing option");
	}

}