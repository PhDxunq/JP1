package Lesson10;

import java.util.Scanner;

public class indexGT {
    public static void headerMenu(){
        System.out.println("1.Them cac phuong tien");
        System.out.println("2.Xoa phuong tien theo ID");
        System.out.println("3.Goi tinh nang choHang cua xe tai theo ID");
        System.out.println("4.Goi tinh nang choKhach cua oto theo ID");
        System.out.println("5.Tim phuong tien theo hang san xuat");
        System.out.println("6.Tim phuong tien theo mau");
        System.out.println("7.Thoat khoi chuong trinh");
        System.out.print("Chon chuc nang cua chuogn trinh: ");
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("ham");
                    break;
                default:
                break;
            }

        }while (choice > 0 && choice <7);
    }
}
