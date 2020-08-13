package b13ThuatToanTimKiem.BaiTap;

import java.util.Scanner;

public class BinarySearchDeQuy {


    public static int binarySearch(int[] arr,int low, int high, int value){
        if(high>=low) {
            int mid = low + (high - low)/2;
            if(arr[mid] == value)
                return mid;
            if(arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,9,12,34,56,668,896,34354,13123213};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt() ;
        System.out.println(binarySearch(arr, 0, arr.length-1,value));
    }
}
