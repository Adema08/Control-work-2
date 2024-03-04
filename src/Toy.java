public class Toy {
    private int toy_id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int toy_id, String name, int quantity, double weight) {
        this.toy_id = toy_id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return toy_id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
}
