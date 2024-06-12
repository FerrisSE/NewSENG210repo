//Calculate payment for Pizzas

public class PizzaPayment {

    private double[] pizzaPrices;
    private double payment;
    private double totalCost;

    public PizzaPayment(double[] pizzaPrices, double payment) {
        this.pizzaPrices = pizzaPrices;
        this.payment = payment;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost() {
        double cost = 0;
        for (double price : pizzaPrices) {
            cost += price;
        }
        cost += (cost * 0.06); // Adding Taxes (6%)
        return cost;
    }

    public double TotalCost() {
        return totalCost;
    }

    public double processPayment() {
        return payment - totalCost;
    }

    @Override
    public String toString() {
        return "The total cost of the order is $" + totalCost + ", after paying $" + payment + " your total balance is $" + processPayment() + ".";
    }
}

