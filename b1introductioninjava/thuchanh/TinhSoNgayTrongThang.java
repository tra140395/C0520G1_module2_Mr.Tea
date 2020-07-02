package b1introductioninjava.thuchanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("nhập tháng bạn muốn kiểm tra: ");
        Scanner scanner =new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+month+" có 31 ngày!");
                break;
            case 2:
                System.out.println("tháng 2 có 28 or 29 ngày!");
                break;
            default:
                System.out.println("tháng "+month+" có 30 ngày!");
        }
    }
}
