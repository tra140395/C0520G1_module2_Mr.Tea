package b3mangvaphuongthuc.baitap;

import java.util.Scanner;

public class ThemPtVaoMang {
    public static void main(String[] args) {
//        int[]array = {1,3,5,2,3,0,0,0,0};
//        int x = 10;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap vi tri can chen: ");
//        int index=Integer.parseInt(scanner.nextLine());
//        if (index <= 1 || index >= array.length) {
//            System.out.println("not chen duoc");
//        }
//        for(int i=array.length-1 ; i > index; i--){
//            array[i] = array[i-1];
//        }
//        array[index]=10;
//        for(int i=0;i<array.length;i++)
//            System.out.println(array[i]);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vi tri can chen: ");
        int index = scanner.nextInt();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
