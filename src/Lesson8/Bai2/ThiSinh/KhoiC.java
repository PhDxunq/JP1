package Lesson8.Bai2.ThiSinh;

import java.util.Scanner;

public class KhoiC extends ThiSinh{

    private double van;
    private double su;
    private double dia;

    public KhoiC() {
    }

    public KhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, double van, double su, double dia) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem van: ");
        van = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem su: ");
        su = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem dia: ");
        dia = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "van=" + van +
                ", su=" + su +
                ", dia=" + dia +
                "} " + super.toString();
    }
}
