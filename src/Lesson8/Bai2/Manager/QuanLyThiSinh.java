package Lesson8.Bai2.Manager;

import Lesson8.Bai2.ThiSinh.KhoiA;
import Lesson8.Bai2.ThiSinh.KhoiB;
import Lesson8.Bai2.ThiSinh.KhoiC;
import Lesson8.Bai2.ThiSinh.ThiSinh;

import java.util.ArrayList;

public class QuanLyThiSinh {

    private ArrayList<ThiSinh> listThiSinh;
    private ArrayList<KhoiA> listThiSinhKhoiA;
    private ArrayList<KhoiB> listThiSinhKhoiB;
    private ArrayList<KhoiC> listThiSinhKhoiC;

    public QuanLyThiSinh() {
        this.listThiSinh = new ArrayList<>();
        this.listThiSinhKhoiA = new ArrayList<>();
        this.listThiSinhKhoiB = new ArrayList<>();
        this.listThiSinhKhoiC = new ArrayList<>();
    }

    public void themSinhVien(String khoiThi){
        if (khoiThi.equalsIgnoreCase("A")){
            KhoiA thiSinhKhoiA = new KhoiA();
            thiSinhKhoiA.input();
            listThiSinh.add(thiSinhKhoiA);
            listThiSinhKhoiA.add(thiSinhKhoiA);
        } else if (khoiThi.equalsIgnoreCase("B")) {
            KhoiB thiSinhKhoiB = new KhoiB();
            thiSinhKhoiB.input();
            listThiSinh.add(thiSinhKhoiB);
            listThiSinhKhoiB.add(thiSinhKhoiB);
        } else if (khoiThi.equalsIgnoreCase("C")) {
            KhoiC thiSinhKhoiC = new KhoiC();
            thiSinhKhoiC.input();
            listThiSinh.add(thiSinhKhoiC);
            listThiSinhKhoiC.add(thiSinhKhoiC);
        } else {
            System.out.println("Khong co khoi thi, moi nhap lai.");
        }
    }

    public void hienThiThiSinh(){
        for (ThiSinh thiSinh : listThiSinh){
            thiSinh.display();
        }
    }

    public void timKiemTheoSBD(int soBaoDanh){
        for (ThiSinh thiSinh : listThiSinh){
            if (thiSinh.getSoBaoDanh() == soBaoDanh){
                thiSinh.display();
                break;
            }
        }
    }

}
