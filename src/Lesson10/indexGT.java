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
        System.out.print("Chon chuc nang cua chuong trinh: ");
    }
    public static void main(String[] args) {
        int choice;
        int ID;
        Scanner sc = new Scanner(System.in);
        QLPTGT qlptgt = new QLPTGT();
        do {
            headerMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    String loaiPhuongTien;
                    System.out.print("Nhap loai phuong tien: ");
                    loaiPhuongTien = sc.nextLine();
                    qlptgt.themPhuongTien(loaiPhuongTien);
                    break;
                case 2:
                    System.out.print("Nhap ID phuong tien: ");
                    ID = sc.nextInt();
                    sc.nextLine();
                    qlptgt.xoaPhuongTien(ID);
                    break;
                case 3:
                    int khoiLuong;
                    System.out.print("Nhap ID phuong tien: ");
                    ID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap khoi luong: ");
                    khoiLuong = sc.nextInt();
                    sc.nextLine();
                    qlptgt.goiChoHang(ID,khoiLuong);
                    break;
                case 4:
                    int soNguoiCho;
                    System.out.print("Nhap ID phuong tien: ");
                    ID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap so nguoi: ");
                    soNguoiCho = sc.nextInt();
                    sc.nextLine();
                    qlptgt.goiChoKHach(ID,soNguoiCho);
                    break;
                case 5:
                    String hangSanXuat;
                    System.out.print("Nhap hang san xuat: ");
                    hangSanXuat = sc.nextLine();
                    qlptgt.timPhuongTienTheoHSX(hangSanXuat);
                    break;
                case 6:
                    String mauSac;
                    System.out.print("Nhap mau sac: ");
                    mauSac = sc.nextLine();
                    qlptgt.timPhuongTienTheoMau(mauSac);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                break;
            }

        }while (choice > 0 && choice <7);
    }
}
