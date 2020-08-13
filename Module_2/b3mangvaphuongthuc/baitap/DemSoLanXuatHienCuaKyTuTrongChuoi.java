package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap chuoi:");
        String str = scanner.nextLine();
        System.out.println("nhap ky tu:");
        char kt =scanner.nextLine().charAt(0);
        int i;
        int count=0;
        for(i=0;i<str.length();i++) {
            if (str.charAt(i) == kt) {
                count++;
            }
        }
        System.out.println("so lan xuat hien la: "+count);
    }
}
