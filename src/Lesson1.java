import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        // Khai báo biến
        int a;
        float b;
        double c;

        //Khai báo nhiều biến
        int q,w,e,r;

        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " là nguyên âm.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " là phụ âm.");
        } else {
            System.out.println(ch + " không phải là ký tự hợp lệ.");
        }
        //
        System.out.print("Nhập vào số tiền: ");
        double interest;
        double depositMoney = sc.nextDouble();
        if(depositMoney <= 2000){
            interest = 0.04;
        } else if(depositMoney <= 7000 || depositMoney > 2000){
            interest = 0.045;
        } else {
            interest = 0.05;
        }
        depositMoney = depositMoney + interest * depositMoney;
        System.out.println("Số tiền nhận được: " + depositMoney);
    }
}
