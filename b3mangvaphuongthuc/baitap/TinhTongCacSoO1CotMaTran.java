package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongCacSoO1CotMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("nhap rong: ");
            num1 = scanner.nextInt();
            System.out.println("nhap dai: ");
            num2 = scanner.nextInt();
            if (num1 > 3 || num2 > 3) {
                System.out.println("size so big");
            }
        } while (num1 > 3 || num2 > 3);
        int[][] array = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println("nhap phan tu array[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        int x;
        int sum=0;
        System.out.println("nhap cot can tinh tong:");
        x=scanner.nextInt();
        for (int i=0;i<num1;i++){
            sum+=array[i][x];
        }
        System.out.println(sum);
    }
}
