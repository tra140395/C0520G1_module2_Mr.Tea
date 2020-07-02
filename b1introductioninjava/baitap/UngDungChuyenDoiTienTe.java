package b1introductioninjava.baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd;
        System.out.println("nhap so tien can chuyen doi: ");
        int usd =scanner.nextInt();
        vnd =usd*23000;
        System.out.println("voi ty gia 23000 ban doi dc so tien la: "+vnd+" VND");
    }
}
