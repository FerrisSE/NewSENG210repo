public class PizzaStatus {
    public enum Status {
        ORDERED,
        PREPARING,
        BAKING,
        DISPATCHED,
        DELIVERED
    }

    private Status currentStatus;

    public PizzaStatus() {
        this.currentStatus = Status.ORDERED;
    }

    public Status getCurrentStatus() {
        return currentStatus;
    }

    public void nextStatus() {
        switch (currentStatus) {
            case ORDERED:
                currentStatus = Status.PREPARING;
                break;
            case PREPARING:
                currentStatus = Status.BAKING;
                break;
            case BAKING:
                currentStatus = Status.DISPATCHED;
                break;
            case DISPATCHED:
                currentStatus = Status.DELIVERED;
                break;
            case DELIVERED:
                System.out.println("The pizza has already been delivered.");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentStatus);
        }
    }

    @Override
    public String toString() {
        return "Current pizza status: " + currentStatus;
    }

    // This main is simply for testing, not for the overall program.
    public static void main(String[] args) {
        PizzaStatus pizzaStatus = new PizzaStatus();
        System.out.println(pizzaStatus);

        pizzaStatus.nextStatus();
        System.out.println(pizzaStatus);

        pizzaStatus.nextStatus();
        System.out.println(pizzaStatus);

        pizzaStatus.nextStatus();
        System.out.println(pizzaStatus);

        pizzaStatus.nextStatus();
        System.out.println(pizzaStatus);

        pizzaStatus.nextStatus(); // Trying to move beyond the delivered status
    }
}
