package Lesson10;

import java.util.Scanner;

public class XeMay extends Vehicle{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe, int congSuat) {
        super(ID, hangSanXuat, namSanXuat, gia, mauXe);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cong suat: ");
        congSuat = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void khoiDong() {
        System.out.println("Khoi dong xe may");
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                "} " + super.toString();
    }
}
