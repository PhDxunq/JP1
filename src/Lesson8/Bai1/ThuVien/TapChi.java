package Lesson8.Bai1.ThuVien;

import java.util.Scanner;

public class TapChi extends ThuVien{
    private int soPhatHanh;
    private String thanhPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thanhPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thanhPhatHanh = thanhPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThanhPhatHanh() {
        return thanhPhatHanh;
    }

    public void setThanhPhatHanh(String thanhPhatHanh) {
        this.thanhPhatHanh = thanhPhatHanh;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap So Phat Hanh: ");
        soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap Thang Phat Hanh: ");
        thanhPhatHanh = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thanhPhatHanh='" + thanhPhatHanh + '\'' +
                "} " + super.toString();
    }
}
