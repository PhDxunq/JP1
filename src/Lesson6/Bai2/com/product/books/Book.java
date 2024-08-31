package Lesson6.Bai2.com.product.books;

import Lesson6.Bai2.com.product.Product;

import java.util.Scanner;

public class Book extends Product {
    private String type;
    private String publisher;

    public Book() {
    }

    public Book(String proID, String proName, int year, float price, String type, String publisher) {
        this.proID = proID;
        this.proName = proName;
        this.year = year;
        this.price = price;
        this.type = type;
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
        System.out.print("Input Type: ");
        type = sc.nextLine();
        System.out.print("Input Publisher: ");
        publisher = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
