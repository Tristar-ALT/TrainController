public class Car {
    private String cargo;
    private int quantity;
    private double weight;

    public Car(String cargo, int quantity, double weight) {
        this.cargo = cargo;
        this.quantity = quantity;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getCargo(){
        return cargo;
    }
    public int getQuantity(){
        return quantity;
    }
}
