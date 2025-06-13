import java.util.ArrayList;
import java.util.Scanner;

public class Salads {
	
	static int saladCount;

	enum SaladType {
		Ceasar, Greek, Caprese, Garden, Cobb
	}
	
	public static ArrayList<SaladType> salads = new ArrayList<SaladType>();
	
	public static void CreateSalad() {
		Scanner scnr = new Scanner(System.in);
		
		saladCount++;
		
		System.out.println("Select a type of salad to create:\n"
				+ "1. Ceasar Salad\n"
				+ "2. Greek Salad\n"
				+ "3. Caprese Salad\n"
				+ "4. Garden Salad\n"
				+ "5. Cobb Salad\n");
		
		switch (scnr.nextInt()) {
		case 1:
			salads.add(SaladType.Ceasar);
			System.out.println("You created a Ceasar Salad!");
			break;
		case 2:
			salads.add(SaladType.Greek);
			System.out.println("You created a Greek Salad!");
			break;
		case 3:
			salads.add(SaladType.Caprese);
			System.out.println("You created a Caprese Salad!");
			break;
		case 4:
			salads.add(SaladType.Garden);
			System.out.println("You created a Garden Salad!");
			break;
		case 5:
			salads.add(SaladType.Cobb);
			System.out.println("You created a Cobb Salad!");
			break;
		default:
			break;
		}
	}
}
