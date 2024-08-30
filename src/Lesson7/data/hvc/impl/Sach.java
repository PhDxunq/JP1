package Lesson7.data.hvc.impl;

import Lesson7.data.hvc.ITaiLieu;

import java.util.Scanner;

public class Sach implements ITaiLieu {
    private int id;
    private String tenSach;
    private String tenTacGia;
    private float gia;

    public Sach() {
    }

    public Sach(int id, String tenSach, String tenTacGia, float gia) {
        this.id = id;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Ten Sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap Ten Tac Gia: ");
        tenTacGia = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienthi() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", tenSach='" + tenSach + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", gia=" + gia +
                '}';
    }
}
