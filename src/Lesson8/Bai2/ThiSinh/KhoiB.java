package Lesson8.Bai2.ThiSinh;

import java.util.Scanner;

public class KhoiB extends ThiSinh{

    private double toan;
    private double hoa;
    private double sinh;

    public KhoiB() {
    }

    public KhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, double toan, double hoa, double sinh) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem toan: ");
        toan = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem hoa: ");
        hoa = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem sinh: ");
        sinh = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "toan=" + toan +
                ", hoa=" + hoa +
                ", sinh=" + sinh +
                "} " + super.toString();
    }
}
