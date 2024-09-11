package Lesson11.Manager;

import Lesson11.HoTel.Hotel;

import java.util.Scanner;

public class ManagerHotel {
    public static void headerMenu(){
        System.out.println("1.Them Khach Hang");
        System.out.println("2.Xoa Khach Hang");
        System.out.println("3.Tinh Tien Thue Phong");
        System.out.println("4.Thoat Chuong Trinh");
        System.out.print("Lua chon chuc nang: ");
    }
    public static void main(String[] args) {
        int choice;
        int CMND;
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    hotel.addCustomer();
                    break;
                case 2:
                    System.out.print("Nhap CMND can tim: ");
                    CMND = sc.nextInt();
                    sc.nextLine();
                    hotel.deleteCustomoer(CMND);
                    break;
                case 3:
                    int day;
                    String loaiPhong;
                    System.out.print("Nhap CMND can tim: ");
                    CMND = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap so ngay: ");
                    day = sc.nextInt();;
                    sc.nextLine();
                    System.out.print("Nhap loai phong: ");
                    loaiPhong = sc.nextLine();
                    hotel.calculatePrice(day,CMND,loaiPhong);
                    break;
                default:
                    break;
            }
        }while (choice > 0 && choice < 4);
    }
}
