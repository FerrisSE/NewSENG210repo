import java.util.Scanner;

// This class will add an .address to the pizza in file 'Pizza.java'
public class deliveryLocation extends Pizza {
	
	String address;
	
	public deliveryLocation(PizzaSize size, float price) {
		super(size, price);
	}

	public void addAddress() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What (fake) location will the pizza be delivered to?");

		Pizza.address = scanner.nextLine(); // User input will transfer to Pizza.address
	}
}