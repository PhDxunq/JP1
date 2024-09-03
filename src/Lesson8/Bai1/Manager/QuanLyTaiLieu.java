package Lesson8.Bai1.Manager;

import Lesson8.Bai1.ThuVien.Bao;
import Lesson8.Bai1.ThuVien.Sach;
import Lesson8.Bai1.ThuVien.TapChi;
import Lesson8.Bai1.ThuVien.ThuVien;

import java.util.ArrayList;

public class QuanLyTaiLieu {

    private ArrayList<ThuVien> listTailieu;
    private ArrayList<Sach> listSach;
    private ArrayList<TapChi> listTapChi;
    private ArrayList<Bao> listBao;

    public QuanLyTaiLieu() {
        this.listTailieu = new ArrayList<>();
        this.listSach = new ArrayList<>();
        this.listTapChi = new ArrayList<>();
        this.listBao = new ArrayList<>();
    }




    public void themTaiLieu(String loaiTaiLieu){
        if (loaiTaiLieu.equalsIgnoreCase("Sach")){
            Sach sachMoi = new Sach();
            sachMoi.input();
            listTailieu.add(sachMoi);
            listSach.add(sachMoi);
        } else if (loaiTaiLieu.equalsIgnoreCase("TapChi")) {
            TapChi tapChi = new TapChi();
            tapChi.input();
            listTailieu.add(tapChi);
            listTapChi.add(tapChi);
        } else if (loaiTaiLieu.equalsIgnoreCase("Bao")) {
            Bao baoMoi = new Bao();
            baoMoi.input();
            listTailieu.add(baoMoi);
            listBao.add(baoMoi);
        } else {
            System.out.println("Khong co loai tai lieu nay.");
        }
    }

    public void xoaTaiLieu(String maTaiLieu){
        int index = 0;
        for (ThuVien tv : listTailieu){
            if (tv.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)){
                break;
            }
            index++;
        }
        listTailieu.remove(index);

    }

    public void hienThiThongTin(){
        for (ThuVien tv:listTailieu){
            tv.display();
        }
    }

    public void timKiemTailieu(String loaiTaiLieu){
        if (loaiTaiLieu.equalsIgnoreCase("Sach")){
            for (Sach sach : listSach){
                sach.display();
            }
        } else if (loaiTaiLieu.equalsIgnoreCase("TapChi")) {
            for (TapChi tapChi : listTapChi){
                tapChi.display();
            }
        } else if (loaiTaiLieu.equalsIgnoreCase("Bao")) {
            for (Bao bao : listBao){
                bao.display();
            }
        } else {
            System.out.println("Khong co loai tai lieu nay.");
        }
    }

}
