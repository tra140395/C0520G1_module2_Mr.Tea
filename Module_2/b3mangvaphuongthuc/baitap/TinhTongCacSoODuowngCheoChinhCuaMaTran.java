package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongCacSoODuowngCheoChinhCuaMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        int sum=0;
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("nhap phan tu array["+i+"]["+j+"]");
                array[i][j]=scanner.nextInt();
            }
        }
        int a,b;
        for( a=0;a<3;a++){
            System.out.println("  ");
            for(b=0;b<3;b++){
                System.out.print(array[a][b]);
                if(a==b){
                    sum+=array[a][b];
                }
            }
            System.out.println("");
        }
        System.out.println("tong cua cac duong cheo la: "+sum);
    }
}
