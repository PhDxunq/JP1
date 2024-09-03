package Lesson8.Bai1.IndexThuVien;

import Lesson8.Bai1.Manager.QuanLyTaiLieu;

import java.util.Scanner;

public class Index {
    public static void  headerMenu(){
        System.out.println("1.Them moi tai lieu.");
        System.out.println("2.Xoa tai lieu theo ma tai lieu.");
        System.out.println("3.Hien thi thong tin ve tai lieu.");
        System.out.println("4.Tim kiem tai lieu theo loai.");
        System.out.println("5.Thoat khoi chuong trinh.");
        System.out.print("Lua chon chuc nang: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String loaiTaiLieu;
        String maTaiLieu;
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();

        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhap loai tai lieu: ");
                    loaiTaiLieu  = sc.nextLine();
                    quanLyTaiLieu.themTaiLieu(loaiTaiLieu);
                    break;
                case 2:
                    System.out.print("Nhap ma tai lieu: ");
                    maTaiLieu = sc.nextLine();
                    quanLyTaiLieu.xoaTaiLieu(maTaiLieu);
                    break;
                case 3:
                    quanLyTaiLieu.hienThiThongTin();
                    break;
                case 4:
                    System.out.print("Nhap loai tai lieu: ");
                    loaiTaiLieu  = sc.nextLine();
                    quanLyTaiLieu.timKiemTailieu(loaiTaiLieu);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
