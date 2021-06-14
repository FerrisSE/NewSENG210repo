import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	private PizzaSize size;
	private List<String> toppings;
	private float price;
	
	public Pizza(PizzaSize size, float price) {
		this.size = size;
		this.price = price;
		toppings = new ArrayList<String>();
	}
	
	public void addTopping(String topping) {
		// if we already have a topping, don't add it again
		if(toppings.stream().anyMatch(string -> string.equals(topping)))
			return;
		
		toppings.add(topping);
	}

	public PizzaSize getSize() {
		return size;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public float getPrice() {
		return price;
	}
	
}
