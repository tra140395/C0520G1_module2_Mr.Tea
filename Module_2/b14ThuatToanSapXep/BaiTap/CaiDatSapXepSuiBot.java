package b14ThuatToanSapXep.BaiTap;

import java.util.Random;

public class CaiDatSapXepSuiBot {
    public static void insertSort(int[] arr, int size) {
        boolean nextPass = true;
        for (int i = 1; i < size && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    nextPass = true;
                }
            }
        }
    }

    public static void showArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int size = 10;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }
        insertSort(arr,size);
        showArray(arr, size);
    }

}
