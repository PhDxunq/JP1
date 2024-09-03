package Lesson8.Bai2.TuyenSinh;

import Lesson8.Bai2.Manager.QuanLyThiSinh;

import java.util.Scanner;

public class TuyenSinh {
    private static void headerMenu(){
        System.out.println("1.Thêm mới thí sinh.");
        System.out.println("2.Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
        System.out.println("3.Tìm kiếm theo số báo danh.");
        System.out.println("4.Thoát khỏi chương trình.");
        System.out.println("Lua chon chuc nang: ");
    }
    public static void main(String[] args) {
        int choice;
        QuanLyThiSinh quanLyThiSinh = new QuanLyThiSinh();
        String khoiThi;
        int soBaoDanh;
        Scanner sc = new Scanner(System.in);
        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhap khoi thi cua thi sinh can them moi: ");
                    khoiThi = sc.nextLine();
                    quanLyThiSinh.themSinhVien(khoiThi);
                    break;
                case 2:

                    break;
                case 3:

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
