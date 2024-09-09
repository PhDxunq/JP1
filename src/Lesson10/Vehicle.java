package Lesson10;

import java.util.Scanner;

public class Vehicle implements Ivehicle{
    protected int ID;
    protected String hangSanXuat;
    protected int namSanXuat;
    protected double gia;
    protected String mauXe;


    public Vehicle() {
    }

    public Vehicle(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe) {
        this.ID = ID;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.gia = gia;
        this.mauXe = mauXe;
    }

    public int getID() {
        return ID;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    @Override
    public void khoiDong() {

    }

    @Override
    public void dungXe() {

    }

    @Override
    public void phanh() {

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap hang san xuat: ");
        hangSanXuat = sc.nextLine();;
        System.out.print("Nhap nam san xuat: ");
        namSanXuat = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gia: ");
        gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap mau xe: ");
        mauXe = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", gia=" + gia +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}
