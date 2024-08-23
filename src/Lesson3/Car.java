package Lesson3;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public double calculateDepreciation(int currentYear) {
        int age = currentYear - year;
        return price - (price * 0.05 * age);
    }
}
