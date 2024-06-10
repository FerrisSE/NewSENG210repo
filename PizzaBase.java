public class PizzaBase {
    private String name;
    private double price;
    private boolean glutenFree;

    public PizzaBase(String name, double price, boolean glutenFree) {
        this.name = name;
        this.price = price;
        this.glutenFree = glutenFree;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return "PizzaBase{" + "name='" + name + '\'' + ", price="
                + price + ", glutenFree=" + glutenFree + '}';
    }
}
