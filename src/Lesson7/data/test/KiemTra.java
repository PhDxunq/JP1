package Lesson7.data.test;

import Lesson7.data.manager.QuanLyTaiLieu;

import java.util.Scanner;

public class KiemTra {
    public static void headerMenu(){
        System.out.println("người dùng nhập lựa chọn:");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Hiển thị tất cả sách");
        System.out.println("3. Tìm kiếm sách theo tên tác giả");
        System.out.println("4. Thoát");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        int choice;
        do{
            headerMenu();
            System.out.print("Nhap Lua Chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    quanLyTaiLieu.themTaiLieu();
                    break;
                case 2:
                    quanLyTaiLieu.hienThiTatCaTaiLieu();
                case 3:
                    String tenTacGia;
                    System.out.print("Nhap ten tac gia muon tim: ");
                    tenTacGia = sc.nextLine();
                    quanLyTaiLieu.timKiemTheoTacGia(tenTacGia);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (choice > 0 && choice < 4);
    }
}
