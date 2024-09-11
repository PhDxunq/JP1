package Lesson11.HoTel;

import java.util.Scanner;

public class Person extends PersonAbs{

    private int CMND;
    public Person() {
    }

    public Person(String name, int age, double a, double b, double c, int CMND) {
        super(name, age, a, b, c);
        this.CMND = CMND;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }



    @Override
    public void goToWork() {
        System.out.println("Go to work");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap CMND: ");
        int CMND = sc.nextInt();
        sc.nextLine();
        setCMND(CMND);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
    }
}
