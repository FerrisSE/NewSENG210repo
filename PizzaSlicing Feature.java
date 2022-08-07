//Adding new feature to make unlimited pizza!!!

import java.util.Scanner;

class PizzaSlicer{

	public static void main(String [] args){
		System.out.println("How would you like your pizza sliced? How many slices? (4, 6, 8 or 10)");

		Scanner myscanner = new Scanner(System.in);

		int noOfSlices = myscanner.nextInt();
		System.out.println("You chose a pizza with " + noOfSlices + " slices.");
	}

}