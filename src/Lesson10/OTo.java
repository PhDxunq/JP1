package Lesson10;

import java.util.Scanner;

public class OTo extends Vehicle{
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo() {
    }

    public OTo(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(ID, hangSanXuat, namSanXuat, gia, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void khoiDong() {
        System.out.println("Khoi dong o to");
    }

    public int choKHach(int soHanhKhach){
        if(soHanhKhach > soChoNgoi){
            return (soHanhKhach - soChoNgoi);
        } else {
            return 0;
        }
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cho ngoi: ");
        soChoNgoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap kieu dong co: ");
        kieuDongCo = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "OTo{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                "} " + super.toString();
    }
}
