package Lesson5;

public  class Product implements Comparable<Product> {
    private int id;
    private String name;
    private float price;
    private int quantity;


    public Product(int id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + name + price + quantity;
    }


    @Override
    public int compareTo(Product o) {
        if (this.quantity < o.quantity){
            return -1;
        }
        if (this.quantity > o.quantity){
            return 1;
        }
        return 0;
    }



}
