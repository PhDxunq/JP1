package Lesson8.Bai1.ThuVien;

import java.util.Scanner;

public class Bao extends ThuVien {
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
    }

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap Ngay Phat Hanh: ");
        ngayPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                "} " + super.toString();
    }
}
