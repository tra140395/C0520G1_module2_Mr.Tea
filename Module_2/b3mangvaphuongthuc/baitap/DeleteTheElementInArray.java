package b3mangvaphuongthuc.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteTheElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("nhap size: ");
            size =scanner.nextInt();
            if(size>10)
                System.out.println("size so big");
        }while (size>10);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhap phan tu thu "+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("nhap phan tu can xoa: ");
        int x =scanner.nextInt();
        for (int k=0;k<array.length;k++){
            if(x==array[k]){
                for(int j=k;j<array.length-1;j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
