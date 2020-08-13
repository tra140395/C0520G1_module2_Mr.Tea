package b3mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input the size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size>20);
        array = new int[size];
        int i =0;
        while (i<array.length){
            System.out.println("Input the gia tri of array thu "+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"  ");
        }
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j]=array[array.length-1-j];
            array[array.length-1-j]=temp;
        }
        System.out.printf("%-20s%s", "Elements in new array: ", "");
        for(int j=0;j<array.length;j++)
            System.out.print(array[j]+"\t");
    }
}

