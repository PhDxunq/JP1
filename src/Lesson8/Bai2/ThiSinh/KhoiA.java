package Lesson8.Bai2.ThiSinh;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
    private double toan;
    private double ly;
    private double hoa;

    public KhoiA() {
    }

    public KhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, double toan, double ly, double hoa) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem toan: ");
        toan = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem ly: ");
        ly = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem hoa: ");
        hoa = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                "} " + super.toString();
    }
}
