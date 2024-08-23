package Lesson3;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double grade;

    public Student() {}

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public Student(String studentId, String name, int age, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double calculateGPA(double[] grades) {
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
