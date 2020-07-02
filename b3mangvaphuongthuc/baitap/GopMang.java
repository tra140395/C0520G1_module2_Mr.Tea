package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap do rong array 1: ");
        int a=scanner.nextInt();
        System.out.println("nhap do rong cua array2: ");
        int b =scanner.nextInt();
        int[] array1 = new int[a];
        int[] array2 = new int[b];
        int i=0;
        while (i<array1.length){
            System.out.println("nhap phan tu thu "+(i+1));
            array1[i]=scanner.nextInt();
            i++;
        }
        int j=0;
        while (j<array2.length){
            System.out.println("nhap phan tu thu "+(j+1));
            array2[j]=scanner.nextInt();
            j++;
        }
        int c=array1.length+array2.length;
        int[] arraygop=new int[c];
        int k=0;
        for(;k<arraygop.length;k++){
            if(k<array1.length){
                arraygop[k]=array1[k];
            }
            else
                arraygop[k]=array2[k-array1.length];
        }
        for(k=0;k<arraygop.length;k++)
            System.out.print(arraygop[k]+" ");

    }
}
