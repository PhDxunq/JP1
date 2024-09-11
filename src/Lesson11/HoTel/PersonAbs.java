package Lesson11.HoTel;

public abstract class PersonAbs {
    protected String name;
    protected int age;
    protected double A;
    protected double B;
    protected double C;

    public PersonAbs() {
    }

    public PersonAbs(String name, int age, double a, double b, double c) {
        this.name = name;
        this.age = age;
        A = a;
        B = b;
        C = c;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getA() {
        return A = 500;
    }

    public double getB() {
        return B = 200;
    }

    public double getC() {
        return C = 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setA(double a) {
        A = a;
    }

    public void setB(double b) {
        B = b;
    }

    public void setC(double c) {
        C = c;
    }

    public abstract void goToWork();
    public abstract void input();
}
