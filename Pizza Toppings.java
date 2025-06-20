

class PizzaToppings
{
	//the default is a boring cheese pizza
	//Also its obvious but: true if its on, false if its off.
	public boolean pepperoni = false;
	public boolean bacon = false;
	public boolean stuffedCrust = false;
	public boolean pineapple = false;
	public boolean mushrooms = false;
	
	
	PizzaToppings(boolean desiredPepperoni, boolean desiredBacon, boolean desiredStuffedCrust, 
				boolean desiredPineapple, boolean desiredMushrooms)
	{
		//simply set the toppings as required
		this.pepperoni = desiredPepperoni;
		this.bacon = desiredBacon;
		this.stuffedCrust = desiredStuffedCrust;
		this.pineapple = desiredPineapple;
		this.mushrooms = desiredMushrooms;
		
		//Now, if the desired toppings need to be known, they can do PizzaToppings.[whatever]
	}
}




















//EthanZW here: left this as an archive
//Choosing toppings

/*import pizzaToppings;
//I'm not sure what this is...

PT {
	pepperoni = true;
	bacon = true;
	stuffedCrust = true;
	pineapple = false;
	mushrooms = true;
}*/

