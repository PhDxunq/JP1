package Lesson2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Bai 1
        System.out.println("Nhap thong tin nhan vien");
        System.out.print("Nhap ma nhan vien: ");
        String employeeID = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        String employeeName = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Nhap doanh so ban hang: ");
        int saleDone = sc.nextInt();
        double totalSalary;
        double tipMoney;
        if(saleDone >= 4000){
            tipMoney = 0.1;
        } else if (saleDone >= 6000) {
            tipMoney = 0.2;
        } else if (saleDone >= 8000) {
            tipMoney = 0.3;
        } else {
            tipMoney = 0;
        }
        totalSalary = basicSalary + tipMoney * basicSalary;
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Done: " + saleDone);
        System.out.println("Total Salary: " + totalSalary);
    }
}
