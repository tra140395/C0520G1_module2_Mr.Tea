package b14ThuatToanSapXep.BaiTap;

import java.util.Random;

public class CaiDatSapXepChen {
    public static void insertionSort(int[] arr, int size) {
      for(int i = 1; i < size; i++){
          int currentElement = arr[i];
          int j;
          for(j =i -1; j >= 0 && arr[j] > currentElement; j--){
              arr[j+1] = arr[j];
          }
          arr[j+1] = currentElement;
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
        insertionSort(arr,size);
        showArray(arr, size);
    }

}
