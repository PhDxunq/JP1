package Lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static class UserAccount {
        private String username;
        private String password;
        private String userType;
        private int registerDate;
        private String cookie;
        private float price;

        public UserAccount(String username, String password, String userType, int registerDate, String cookie, float price) {
            this.username = username;
            this.password = password;
            this.userType = userType;
            this.registerDate = registerDate;
            this.cookie = cookie;
            this.price = price;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public int getRegisterDate() {
            return registerDate;
        }

        public void setRegisterDate(int registerDate) {
            this.registerDate = registerDate;
        }

        public String getCookie() {
            return cookie;
        }

        public void setCookie(String cookie) {
            this.cookie = cookie;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "UserAccount {" + "\n" +
                    "username = " + username + "\n" +
                    "password = " + password + "\n" +
                    "userType = " + userType + "\n" +
                    "registerDate = " + registerDate + "\n" +
                    "cookie = " + cookie + "\n" +
                    "price = " + price + "\n" +
                    '}';
        }
    }


    // Method to input data
    static void inputData(List<UserAccount> accounts) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong Account: ");
        int numAccount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numAccount; i++) {
            System.out.printf("Nhap vao username [%d]: ",i + 1 );
            System.out.print("\nName: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            System.out.print("user_type: ");
            String userType = input.nextLine();
            int registerDate;
            do {
                System.out.print("Register year: ");
                registerDate = input.nextInt();
                if(registerDate < (2024 - 5) || registerDate > 2024){
                    System.out.println("Register year phải là 5 năm trở lại đây");
                }
            } while ( registerDate < (2024 - 5) || registerDate > 2024);
            input.nextLine();
            System.out.print("Cookie: ");
            String cookie = input.nextLine();
            float price;
            do{
                System.out.print("Price: ");
                price = input.nextFloat();
                if(price > 100000 || price < 0){
                    System.out.println("0<=  giá (price) <= 100000");
                }
            } while(price > 100000 || price < 0);
            input.nextLine();
            UserAccount userAccount = new UserAccount(username, password, userType, registerDate, cookie, price);
            accounts.add(userAccount);
        }

    }

    static void Menu() {
        for(int i = 0; i < 125; i++){
            System.out.print("-");
        }
        System.out.printf("\n|%46s%31s%46s|\n", " ", "Chuong trinh quan ly tai khoan ", " ");
        for(int i = 0; i < 125; i++){
            System.out.print("-");
        }
        System.out.printf("\n|%12s","1. Nhap lieu");
        System.out.printf("\t|%28s","2. Sap xep username theo ten");
        System.out.printf("\t|%19s","3. Sap xep theo gia");
        System.out.printf("\t|%12s","4. Phan tich");
        System.out.printf("\t|%20s","5. Tim user theo ten");
        System.out.printf("\t|%8s\t|\n","6. Thoat");
        for(int i = 0; i < 125; i++){
            System.out.print("-");
        }
        System.out.println(" ");
    }

    static void returnMenu() {
        Scanner inputMenu = new Scanner(System.in);
        System.out.println("Ban muon tiep tuc khong?");
        System.out.println("- Co (bam phim 'y', 'Y')");
        System.out.println("- Khong (bam phim 'n', 'N')");
        System.out.println("- Clear man hinh (bam 'c', 'C')");
        char menu = inputMenu.next().charAt(0);
        if (menu == 'y' || menu == 'Y') {
            Menu();
        } else if (menu == 'n' || menu == 'N') {
            System.exit(0);
        } else if (menu == 'c' || menu == 'C') {
            System.out.println("Clear Consolog");
        } else {
            System.out.println("Lua chon khong hop le.");
        }
    }

    static void accountList(List<UserAccount> accounts) {
        List<String> usernameList = new ArrayList<>();
        for(UserAccount account : accounts) {
            usernameList.add(account.getUsername());
        }
        Collections.sort(usernameList);

        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.printf("\n|%8s\t", "Username");
        System.out.printf("|%8s\t", "Password");
        System.out.printf("|%9s\t", "User_type");
        System.out.printf("|%8s\t", "Reg date");
        System.out.printf("|%6s\t", "Cookie");
        System.out.printf("|%5s\t|\n", "Price");
        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        for(UserAccount account : accounts){
            System.out.print("\n|" + account.username);
            System.out.print("|" + account.password);
            System.out.print("|" + account.userType);
            System.out.print("|" + account.registerDate);
            System.out.print("|" + account.cookie);
            System.out.print("|" + account.price + "\n");
        }
        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    static void priceList(List<UserAccount> accounts) {
        List<Float> priceList = new ArrayList<>();
        for(UserAccount account : accounts) {
            priceList.add(account.getPrice());
        }
        Collections.sort(priceList,Collections.reverseOrder());

        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.printf("\n|%8s\t", "Username");
        System.out.printf("|%8s\t", "Password");
        System.out.printf("|%9s\t", "User_type");
        System.out.printf("|%8s\t", "Reg date");
        System.out.printf("|%6s\t", "Cookie");
        System.out.printf("|%5s\t|\n", "Price");
        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        for(UserAccount account : accounts){
            System.out.print("\n|" + account.username);
            System.out.print("|" + account.password);
            System.out.print("|" + account.userType);
            System.out.print("|" + account.registerDate);
            System.out.print("|" + account.cookie);
            System.out.print("|" + account.price + "|\n");
        }
        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        List<UserAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            Menu();
            System.out.print("Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputData(accounts);
                    for(UserAccount  std : accounts){
                        System.out.println(std.toString());
                    }
                    returnMenu();
                    break;
                case 2:
                    accountList(accounts);
                    returnMenu();
                    break;
                case 3:
                    priceList(accounts);
                    returnMenu();
                    break;
                case 4:
                    System.out.println("Phan tich chua duoc cai dat.");
                    returnMenu();
                    break;
                case 5:
                    returnMenu();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    returnMenu();
            }
        } while (choice != 6);
    }
}
