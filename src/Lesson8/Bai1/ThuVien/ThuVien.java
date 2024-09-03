package Lesson8.Bai1.ThuVien;

import java.util.Scanner;

public class ThuVien implements IThuVien {
    protected String maTaiLieu;
    protected String nhaXuatBan;
    protected int soBanPhatHanh;

    public ThuVien() {
    }

    public ThuVien(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Tai Lieu: ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhap Nha Xuat Ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap So Ban Phat Hanh: ");
        soBanPhatHanh = sc.nextInt();
        sc.nextLine();

    };
    public void display(){
        System.out.println(this.toString());
    };

    @Override
    public String toString() {
        return "ThuVien{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
