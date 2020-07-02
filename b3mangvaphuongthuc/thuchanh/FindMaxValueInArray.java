package b3mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("nhap size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 10)
                System.out.println("so big size");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        int max = array[0];
        while (i < array.length) {
            System.out.print("enter element: " + (i + 1) + " :");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max trong mang is : "+max);
    }
}
