package b1introductioninjava.thuchanh;

import java.util.Scanner;

public class TinhChiSoCanNangIBM {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap can nang:");
        weight =scanner.nextDouble();
        System.out.println("nhap chieu cao:");
        height =scanner.nextDouble();
        bmi= weight/(Math.pow(height, 2.0));
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
