package b14ThuatToanSapXep.Demo;

public class TestNoiBot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 15, 8, 6};
        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                for (int l = 0; l < arr.length; l++) {
                    System.out.print(" "+arr[l]);
                }
                System.out.println(" ");
            }
            System.out.println("");
        }
    }
}
