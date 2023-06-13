/**
 * This is a class for creating pasta objects.  It contains setters, getters, and variables.
 */
public class Pasta {

    /**
     * Price of dish in us dollars as a float variable.
     */
    private float dishPrice;

    /**
     * Size of dish as a String.
     */
    private String dishSize;

    /**
     * Name of dish as a String.
     */
    private String dishName;

    /**
     * Default Constructor of Pasta.  Price is $0.00, size is Regular, and name is unspecified.
     */
    public Pasta() {
        this.dishPrice = 0.00f;
        this.dishSize = "regular";
        this.dishName = "unspecified";
    }

    /**
     * Overloaded Constructor.  User selects values for name, price, and size.
     * @param dishName the dish's name as String
     * @param dishPrice the dish's price as float
     * @param dishSize the dish's size as String
     */
    public Pasta(String dishName, Float dishPrice, String dishSize) {
        this.dishName = dishName;
        this.dishSize = dishSize;
        this.dishPrice = dishPrice;
    }

    /**
     * Set dish price with this setter method.
     * @param dishPrice the dish's price as float
     */
    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }

    /**
     * Set dish size with this setter method.
     * @param dishSize the dish's size as String
     */
    public void setDishSize(String dishSize) {
        this.dishSize = dishSize;
    }

    /**
     * Set the dish name with this setter method.
     * @param dishName the dish's name as String
     */
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    /**
     * Get the dish's name with this getter method.
     * @return dish's name as String
     */
    public String getDishName() {
        return dishName;
    }

    /**
     * Get the dish's size with this getter method.
     * @return dish's size as String
     */
    public String getDishSize() {
        return dishSize;
    }

    /**
     * Get the dish's price with this getter method.
     * @return dish's price as float
     */
    public float getDishPrice() {
        return this.dishPrice;
    }

    /**
     * Gets the dish's name, size, and price with this overrided method.
     * @return dish's name, size, and price as String in the format of "Dish: , Size: , Price: $".
     */
    @Override
    public String toString() {
        return "Dish: " + dishName + ", Size: " + dishSize + ", Price: $" + dishPrice;
    }

}