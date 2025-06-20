/**
 * This is a class for creating sub objects.  It contains setters, getters, and variables.
 */
public class Subs {

    /**
     * Price of sub in us dollars as a float variable.
     */
    private float subPrice;

    /**
     * Size of sub as an int.
     */
    private int subLength;

    /**
     * Name of sub as a String.
     */
    private String subName;

    /**
     * Default Constructor of Sub.  Price is $0.00, size is 6in, and name is unspecified.
     */
    public void Pasta() {
        this.subPrice = 0.00f;
        this.subLength = 6;
        this.subName = "unspecified";
    }

    /**
     * Overloaded Constructor.  User selects values for name, price, and size.
     * @param subName the sub's name as String
     * @param subPrice the sub's price as float
     * @param subLength the sub's size as int
     */
    public void Sub(String subName, Float subPrice, int subLength) {
        this.subName = subName;
        this.subLength = subLength;
        this.subPrice = subPrice;
    }

    /**
     * Set sub price with this setter method.
     * @param subPrice the sub's price as float
     */
    public void setSubPrice(float subPrice) {
        this.subPrice = subPrice;
    }

    /**
     * Set sub size with this setter method.
     * @param subLength the sub's size as String
     */
    public void setSubLength(int subLength) {
        this.subLength = subLength;
    }

    /**
     * Set the sub name with this setter method.
     * @param subName the sub's name as String
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * Get the sub's name with this getter method.
     * @return sub's name as String
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Get the sub's size with this getter method.
     * @return sub's size as String
     */
    public int getSubLength() {
        return subLength;
    }

    /**
     * Get the sub's price with this getter method.
     * @return sub's price as float
     */
    public float getSubPrice() {
        return this.subPrice;
    }

    /**
     * Gets the sub's name, size, and price with this overrided method.
     * @return sub's name, size, and price as String in the format of "sub: , Size: , Price: $".
     */
    @Override
    public String toString() {
        return "sub: " + subName + ", Size: " + subLength + ", Price: $" + subPrice;
    }

}
