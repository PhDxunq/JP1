package Lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Index {

    public static void headerMenu(){
        System.out.println("Chuong trinh quan ly san pham");
        System.out.print("1. Nhap lieu|");
        System.out.print("2. Bao cao het hang |");
        System.out.print("3. Sap xep theo gia|");
        System.out.print("4. Banhang|");
        System.out.print("5. Bao cao|");
        System.out.println("6. Thoat");
    }
    public static void inputProduct(ArrayList<Product> listPro){
        int numOfEle;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        numOfEle = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numOfEle; i++) {
            System.out.print("Ma san pham: ");
            int idProduct = sc.nextInt();
            sc.nextLine();
            System.out.print("Ten san pham: ");
            String nameProduct = sc.nextLine();
            float priceProduct;
            do {
                    System.out.print("Gia san pham: ");
                    priceProduct = sc.nextFloat();

            } while (priceProduct < 0 ||  priceProduct > 10000000);
            sc.nextLine();
            int quanProduct;
            do {
                System.out.print("So luong san pham: ");
                quanProduct = sc.nextInt();
            } while (quanProduct < 0);
            sc.nextLine();
            Product product = new Product(idProduct,nameProduct,priceProduct,quanProduct);
            listPro.add(product);
        }
    }

    public static void top3Product(ArrayList<Product> listPro){
        Collections.sort(listPro);
        ArrayList<Product> top3 = new ArrayList<>(listPro.subList(0, 3));

        for (Product product : top3){
            System.out.println(product.toString());
        }
    }

    public static void arrangePrice(ArrayList<Product> listPro){
        listPro.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()){
                return -1;
            }
            if (o1.getPrice() >o2.getPrice()){
                return 1;
            }
            return 0;
        });
        for (Product product : listPro){
            System.out.println(product.toString());
        }
    }
    public static void outputList(ArrayList<Product> listPro){
        for (Product product : listPro){
            System.out.println(product.toString());
        }
        Scanner sc = new Scanner(System.in);
        int inputID;
        int inputQuantity;
        System.out.print("Nhap Id san pham: ");
        inputID = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so luong san pham can ban: ");
        inputQuantity = sc.nextInt();
        sc.nextLine();
        for (Product product : listPro){
            if (product.getId() == inputID && product.getQuantity() > inputQuantity){
                int newQuantity = product.getQuantity() - inputQuantity;
                product.setQuantity(newQuantity);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> listPro = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            headerMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    inputProduct(listPro);
                    break;
                case 2:
                    top3Product(listPro);
                    break;
                case 3:
                    arrangePrice(listPro);
                    break;
                case 4:
                    outputList(listPro);
                    break;
                case 5:
                    System.out.println("Em chua hieu de lam a");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while(choice < 0 || choice > 6);
    }
}
