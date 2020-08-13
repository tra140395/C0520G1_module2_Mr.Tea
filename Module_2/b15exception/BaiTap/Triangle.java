package b15exception.BaiTap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("canh tam giac ko duoc nho hơn 0");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("tong 2 canh pha lon hon canh con lai");
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh 1:");
            int a = scanner.nextInt();
            System.out.println("Nhạp cạnh 2:");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh 3:");
            int c = scanner.nextInt();
            checkTriangle(a, b, c);
        } catch (InputMismatchException i){
            System.err.println("k dc la chu");
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }

    }
}
