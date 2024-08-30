package Lesson6.Bai2.com.product.computers;

import Lesson6.Bai2.com.product.Product;

import java.util.Scanner;

public class Computer extends Product {

    private String speed;
    private String producer;

    public Computer() {
    }

    public Computer(String proID, String proName, int year, float price, String speed, String producer) {
        this.proID = proID;
        this.proName = proName;
        this.year = year;
        this.price = price;
        this.speed = speed;
        this.producer = producer;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Product ID: ");
        proID = sc.nextLine();
        System.out.print("Input Product Name: ");
        proName = sc.nextLine();
        System.out.print("Input Year: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Input Price: ");
        price = sc.nextFloat();
        sc.nextLine();
        System.out.print("Input Speed: ");
        speed = sc.nextLine();
        System.out.print("Input Producer: ");
        producer = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "speed='" + speed + '\'' +
                ", producer='" + producer + '\'' +
                ", proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
