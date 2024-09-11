package Lesson11.HoTel;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel implements IHotel {
    private ArrayList<Person> listPerson;

    public Hotel() {
        this.listPerson = new ArrayList<>();
    }

    @Override
    public void addCustomer() {
        Person ps = new Person();
        ps.input();
        listPerson.add(ps);
    }

    @Override
    public void deleteCustomoer(int CMND) {
        boolean remove = listPerson.removeIf(ps -> ps.getCMND() == CMND);
        if (remove){
            System.out.println("Da xoa thanh cong");
        } else {
            System.out.println("Khong co khach hang");
        }
    }

    @Override
    public void calculatePrice(int day,int CMND, String loaiPhong) {
        for (Person ps : listPerson){
            if (ps.getCMND() == CMND){
                if (loaiPhong.equalsIgnoreCase("A")){
                    System.out.println(day * ps.getA());
                } else if (loaiPhong.equalsIgnoreCase("B")){
                    System.out.println(day * ps.getB());
                } else if (loaiPhong.equalsIgnoreCase("C")) {
                    System.out.println(day * ps.getC());
                }
            } else {
                System.out.println("Khong tim thay");
            }
        }
    }
}
