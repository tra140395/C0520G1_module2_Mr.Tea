package b1introductioninjava.thuchanh;

import java.util.Scanner;

public class TinhDtichHcn {
    public static void main(String[] args) {
        float width;
        float height;
        float dt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh rong:");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap canh dai: ");
        height = Float.parseFloat(scanner.nextLine());
        dt = width * height;
        System.out.println("dien tich hcn la: "+dt);
    }
}
