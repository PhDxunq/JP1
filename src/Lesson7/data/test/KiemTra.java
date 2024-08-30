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
        int choice;
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        do{
            headerMenu();
            chocie = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    quanLyTaiLieu.themTaiLieu();
                    break;
                case 2:
                    quanLyTaiLieu.hienThiTatCaTaiLieu();
                case 3:
                    String tenTacGia;
                    tenTacGia = sc.nextLine();
                    quanLyTaiLieu.timKiemTheoTacGia(tenTacGia);
                    break;
                case 4:
                    System.exit();
                    break;
                default:
                    break;
            }
        } while (choice < 0 || choice > 4);
    }
}
