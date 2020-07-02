package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class FindTheMinValueOfTheElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap do lon cua mang: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("size so big");
        }while (size>10);
        array =new int [size];
        int i=0;
        while (i<array.length){
            System.out.println("Nhap phan tu thu "+(i+1)+" cua array: ");
            array[i]= scanner.nextInt();
            i++;
        }
        int min=array[0];
        for(int j=0;j<array.length;j++){
            if(array[j]<min)
                min=array[j];
        }
        System.out.println(min+" nho nhat in mang");
    }

}
