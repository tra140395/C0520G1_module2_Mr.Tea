package b2vonglap.thuchanh;

import java.util.Scanner;

public class XacDinhSnt {
    public static void main(String[] args) {
        System.out.println("Input the number can kiem tra: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println(number + " ko phai la snt");
        else {
            int i = 2;
            boolean check = true;
            while (i <Math.sqrt(number)){
                if(number%i==0){
                    check =false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+ " is snt");
            else
                System.out.println(number+" isn't snt");
        }

    }
}