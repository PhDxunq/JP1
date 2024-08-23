package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Vui lòng chọn tính năng:");
            System.out.println("1. Tạo đối tượng Person và hiển thị thông tin");
            System.out.println("2. Tạo đối tượng 4 Sinh viên và hiển thị điểm trung bình từng sinh viên (4 constructor khác nhau)");
            System.out.println("3. Tạo tài khoản ngân hàng và nạp rút");
            System.out.println("4. Tạo đối tượng máy tính và hiển thị thông tin");
            System.out.println("5. Tạo hình tròn và hiển thị tính chu vi diện tích");
            System.out.println("6. Tạo đối tượng động vật và in ra tiếng kêu");
            System.out.println("7. Tạo đối tượng xe hơi và in ra giảm giá");
            System.out.println("8. Tạo đối tượng nhân viên và in ra lương hàng năm");
            System.out.println("0. Thoát");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Tạo và sử dụng đối tượng Person
                    System.out.print("Nhập tên: ");
                    String personName = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int personAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập giới tính: ");
                    String personGender = scanner.nextLine();
                    Person person = new Person(personName, personAge, personGender);
                    person.getInfo();
                    break;

                case 2:

                    break;

                case 3:
                    System.out.print("Nhập số dư ban đầu: ");
                    double initialBalance = scanner.nextDouble();
                    BankAccount account = new BankAccount(initialBalance);
                    System.out.print("Nhập số tiền muốn nạp: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.print("Nhập số tiền muốn rút: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Nhập thương hiệu: ");
                    String brand = scanner.nextLine();
                    System.out.print("Nhập model: ");
                    String model = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    Computer computer = new Computer(brand, model, price);
                    computer.displayInfo();
                    break;

                case 5:
                    System.out.print("Nhập bán kính: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Diện tích: " + circle.calculateArea());
                    System.out.println("Chu vi: " + circle.calculatePerimeter());
                    break;

                case 6:
                    System.out.print("Nhập tên động vật: ");
                    String animalName = scanner.nextLine();
                    System.out.print("Nhập tiếng kêu: ");
                    String sound = scanner.nextLine();
                    Animal animal = new Animal(animalName, sound);
                    animal.makeSound();
                    break;

                case 7:
                    System.out.print("Nhập thương hiệu: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Nhập model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Nhập năm sản xuất: ");
                    int year = scanner.nextInt();
                    System.out.print("Nhập giá: ");
                    double carPrice = scanner.nextDouble();
                    Car car = new Car(carBrand, carModel, year, carPrice);
                    System.out.print("Nhập năm hiện tại: ");
                    int currentYear = scanner.nextInt();
                    System.out.println("Giá trị sau khấu hao: " + car.calculateDepreciation(currentYear));
                    break;

                case 8:
                    System.out.print("Nhập tên: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Nhập mã nhân viên: ");
                    String employeeId = scanner.nextLine();
                    System.out.print("Nhập vị trí: ");
                    String position = scanner.nextLine();
                    System.out.print("Nhập lương hàng tháng: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(employeeName, employeeId, position, salary);
                    System.out.println("Lương hàng năm: " + employee.calculateAnnualSalary());
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println();

        } while (choice != 0);

        scanner.close();
    }
}