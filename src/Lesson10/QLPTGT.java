package Lesson10;

import java.util.ArrayList;

public class QLPTGT {
    private ArrayList<Vehicle> listVehicle;
    private ArrayList<XeMay> listXeMay;
    private ArrayList<XeTai> listXeTai;
    private ArrayList<OTo> listOTo;

    public QLPTGT() {
        this.listVehicle = new ArrayList<>();
        this.listXeMay = new ArrayList<>();
        this.listXeTai = new ArrayList<>();
        this.listOTo = new ArrayList<>();
    }

    public void themPhuongTien(String loaiPhuongTien){
        if (loaiPhuongTien.equalsIgnoreCase("Xe May")){
            XeMay xeMayMoi = new XeMay();
            xeMayMoi.input();
            listVehicle.add(xeMayMoi);
            listXeMay.add(xeMayMoi);
        } else if (loaiPhuongTien.equalsIgnoreCase("Xe Tai")){
            XeTai xeTaiMoi = new XeTai();
            xeTaiMoi.input();
            listVehicle.add(xeTaiMoi);
            listXeTai.add(xeTaiMoi);
        } else if (loaiPhuongTien.equalsIgnoreCase("OTO")){
            OTo oToMoi = new OTo();
            oToMoi.input();
            listVehicle.add(oToMoi);
            listOTo.add(oToMoi);
        } else{
            System.out.println("Khong co loai phuong tien nay");
        }
    }

    public void xoaPhuongTien(int ID){
        boolean removed = listVehicle.removeIf(pt -> pt.getID() == ID);
        if (removed) {
            System.out.println("Phuong tien da duoc xoa.");
        } else {
            System.out.println("Khong tim thay phuong tien " );
        }
    }

    public void goiChoHang(int ID, int khoiLuong){
        for (XeTai xeTai : listXeTai){
            if (xeTai.getID() == ID){
                xeTai.choHang(khoiLuong);
            }else {
                System.out.println("Khong phai xe tai.");
                break;
            }
        }
    }

    public void goiChoKHach(int ID, int soNguoiCho){
        for(OTo oto : listOTo){
            if (oto.getID() == ID){
                oto.choKHach(soNguoiCho);
            } else {
                System.out.println("Khong phai O To.");
                break;
            }
        }
    }

    public void timPhuongTienTheoHSX(String hangSanXuat){
        for (Vehicle pt : listVehicle){
            if (pt.getHangSanXuat().equalsIgnoreCase(hangSanXuat)){
                pt.display();
            } else {
                System.out.println("Khong co phuong tien");
                break;
            }
        }
    }

    public void timPhuongTienTheoMau(String mauSac){
        for (Vehicle pt : listVehicle){
            if (pt.getMauXe().equalsIgnoreCase(mauSac)){
                pt.display();
            }else {
                System.out.println("Khong co phuong tien");
                break;
            }
        }
    }

}
