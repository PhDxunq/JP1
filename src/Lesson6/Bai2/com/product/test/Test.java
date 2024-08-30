package Lesson6.Bai2.com.product.test;

import Lesson6.Bai2.com.product.books.Book;
import Lesson6.Bai2.com.product.computers.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void headerMenu(){
        System.out.println("Please select:");
        System.out.println("1. Input information for n Computers.");
        System.out.println("2. Input information for n Books.");
        System.out.println("3. Display information of n Computers by sorting the price descending.");
        System.out.println("4.  Display information of n Books by sorting the publisher  ascending.");
        System.out.println("5. Exit.");
        System.out.print("Your Choice: ");
    }
    public static void inputComputer(ArrayList<Computer> listCom){
        int n;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Computer computer = new Computer();
            computer.input();
            listCom.add(computer);
        }
    }
    public static void inputBook(ArrayList<Book> listBook){
        int n;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.input();
            listBook.add(book);
        }
    }
    public static void sortComputerByPrice(ArrayList<Computer> listCom){
        listCom.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()){
                return -1;
            }
            if (o1.getPrice() < o2.getPrice()){
                return 1;
            }
            return 0
        });
        for (Computer computer : listCom){
            computer.display();;
        }
    }

    public static void sortBookByPublisher(ArrayList<Book> listBook){
        listBook.sort((o1, o2) -> {
            if (o1.getPublisher() < o2.getPublisher()){
                return -1;
            }
            if (o1.getPublisher() > o2.getPublisher()){
                return 1;
            }
            return 0;
        });
        for (Book book : listBook){
            book.display();
        }
    }

    public static void main(String[] args) {
        ArrayList<Computer> listCom = new ArrayList<>();
        ArrayList<Book> listBook = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    inputComputer(listCom);
                    break;
                case 2:
                    inputBook(listBook);
                    break;
                case 3:
                    sortComputerByPrice(listCom);
                    break;
                case 4:
                    sortBookByPublisher(listBook);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (choice < 0 || choice > 5);
    }
}
