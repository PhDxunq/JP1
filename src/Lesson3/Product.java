package Lesson3;

public class Product {
    private String name;
    private int price;
    private float quantity;

    public Product(String name, int price, float quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return (int)(price * quantity);
    }
}
