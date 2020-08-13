package b1introductioninjava.thuchanh;

import java.util.Scanner;

public class XacDinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        if (((year % 4 ==0)&&(year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0)))
            System.out.println(year+" là năm nhuận");
        else
            System.out.println(year+" ko phải năm nhuận");
    }
}
