package Lesson7.data.manager;

import Lesson7.data.hvc.impl.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiLieu {
    private ArrayList<Sach> listSach;
    public QuanLyTaiLieu() {
        this.listSach = new ArrayList<>();
    }

    public void themTaiLieu(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Sach sach = new Sach();
            sach.nhap();
            listSach.add(sach);
        }
    }
    public void hienThiTatCaTaiLieu(){
        for (Sach sach : listSach){
            sach.hienthi();
        }
    }

    public void timKiemTheoTacGia(String tenTacGia){

        for (Sach sach : listSach){
            if (sach.getTenTacGia().equalsIgnoreCase(tenTacGia)){
                sach.hienthi();
            } else {
                System.out.println("Khong tim thay");
            }
        }
    }
}
