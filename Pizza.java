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
	
	public void removeTopping(String topping) {
		toppings.remove(topping);
	}
	
	public boolean isVegetarian() {
		for (String topping : toppings) {
			if (!isVegetarianTopping(topping)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isVegetarianTopping(String topping) {
	    String lowercaseTopping = topping.toLowerCase();
	    return !lowercaseTopping.equals("ham")
	            && !lowercaseTopping.equals("bacon")
	            && !lowercaseTopping.equals("chicken")
	            && !lowercaseTopping.equals("turkey")
	            && !lowercaseTopping.equals("pepperoni")
	            && !lowercaseTopping.equals("salami");
	}

	private int sizeToRadius() {
		Map<String, int> sizes = new HashMap<String, int>();
		sizes.put("TINY", 6);
		sizes.put("SMALL", 8);
		sizes.put("MEDIUM", 12);
		sizes.put("LARGE", 16);
		sizes.put("GINORMOUS", 20);
		sizes.put("EXTRANORMOUS", 24);
		return sizes.get(this.size);
	}
}
