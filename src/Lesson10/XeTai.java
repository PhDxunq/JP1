package Lesson10;

import java.util.Scanner;

public class XeTai extends Vehicle{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe, int trongTai) {
        super(ID, hangSanXuat, namSanXuat, gia, mauXe);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trong tai: ");
        trongTai = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void khoiDong() {
        System.out.println("Khong dong xe tai");
    }

    public void choHang(int khoiLuong){
        if(khoiLuong > trongTai){
            System.out.println("Khoi luong khong phu hop.");
        } else {
            System.out.println("Khoi luong phu hop.");
        }
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                "} " + super.toString();
    }
}
