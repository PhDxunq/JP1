package Lesson8.Bai1.ThuVien;

import java.util.Scanner;

public class Sach extends ThuVien{
    private String tenTacGia;
    private int soTrang;

    public Sach() {

    }

    public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
    }

    public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap Ten Tac Gia: ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhap So Trang: ");
        soTrang = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                "} " + super.toString();
    }
}
