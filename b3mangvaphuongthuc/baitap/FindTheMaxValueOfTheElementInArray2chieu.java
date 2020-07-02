package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class FindTheMaxValueOfTheElementInArray2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap do rong cua mang: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu: Array[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
//        int max = array[0][0];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(array[i][j]>max){
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println("max la " + max);
        int max;
        int[] arrtam = new int[n];
        for (int i = 0; i < n; i++) {
            max = array[i][0];
            for (int j = 1; j < m; j++) {
                if (array[i][j] > max)
                    max = array[i][j];
            }
            arrtam[i] = max;
        }
        // tim gia tri lon nhat cua cac gia tri lon nhat
        int max2 = arrtam[0];
        for (int i = 0; i < arrtam.length; i++) {
            if (arrtam[i] > max2)
                max2 = arrtam[i];
        }
        System.out.println("max trong array is " + max2);
    }
}
