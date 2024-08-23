package Lesson4.Bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static class Employee {
        private String name;
        private String country;
        private int birthYear;
        private int salary;

        public Employee() {
        }

        public Employee(String name, String country, int birthYear, int salary) {
            this.name = name;
            this.country = country;
            this.birthYear = birthYear;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', country='" + country + "', birthYear=" + birthYear + ", salary=" + salary + '}';
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Chương Trình Quản Lý Nhân Sự");
            System.out.println("1. Nhập thông tin nhân sự");
            System.out.println("2. Sắp xếp nhân sự theo lương giảm dần");
            System.out.println("3. Phân tích theo quê quán");
            System.out.println("4. Tìm nhân sự theo quê quán và lương thấp nhất");
            System.out.println("5. Lưu danh sách nhân sự vào file");
            System.out.println("6. Mở file và hiển thị danh sách");
            System.out.println("7. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputEmployeeInfo();
                    break;
                case 2:
                    sortEmployeesBySalary();
                    break;
                case 3:
                    analyzeByCountry();
                    break;
                case 4:
                    findEmployeesByCountryAndSalary();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }

    private static void inputEmployeeInfo() {
        System.out.print("Nhập tên nhân sự: ");
        String name = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        String country = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        int birthYear = scanner.nextInt();
        System.out.print("Nhập lương: ");
        int salary = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee emp = new Employee(name, country, birthYear, salary);
        employees.add(emp);
    }

    private static void sortEmployeesBySalary() {
        employees.sort((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private static void analyzeByCountry() {
        Map<String, Integer> countryCount = new HashMap<>();
        for (Employee emp : employees) {
            countryCount.put(emp.getCountry(), countryCount.getOrDefault(emp.getCountry(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : countryCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void findEmployeesByCountryAndSalary() {
        System.out.print("Nhập quê quán: ");
        String country = scanner.nextLine();
        System.out.print("Nhập mức lương thấp nhất: ");
        int minSalary = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Employee emp : employees) {
            if (emp.getCountry().equalsIgnoreCase(country) && emp.getSalary() >= minSalary) {
                System.out.println(emp);
            }
        }
    }


}
