package b2vonglap.baitap;

import java.util.Scanner;

public class MenuInCacHinh {
    public static void main(String[] args) {
        System.out.println("Enter your choice: ");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1: {
                for (int i = 0; i <6; i++) {
                    for (int j = 0; j <= 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:{
                for(int i=0;i<=7;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            }
            case 3:{
                for(int i=7;i>=0;i--){
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            }
            case 4: {
                System.out.println("Exit!!!");
                System.exit(0);
            }
            default:
                System.out.println("No choice!");
        }
    }
}
