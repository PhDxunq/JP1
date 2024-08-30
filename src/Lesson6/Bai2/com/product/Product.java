package Lesson6.Bai2.com.product;

public abstract class Product {
    protected String proID;
    protected String proName;
    protected int year;
    protected float price;

    public Product() {
    }

    public Product(String proID, String proName, int year, float price) {
        this.proID = proID;
        this.proName = proName;
        this.year = year;
        this.price = price;

    }

    public String getProID() {
        return proID;
    }

    public String getProName() {
        return proName;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract void input();
    public abstract void display();
}
