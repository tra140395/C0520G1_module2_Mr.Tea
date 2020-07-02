package b2vonglap.baitap;

import java.util.Scanner;

public class HienThi20Snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of the Snt u want to printout:");
        int number = scanner.nextInt();
        int count=0;
        int n;
        for(n=2;count<number;n++){
            boolean check=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(n+" ");
                count++;

            }
        }
    }
}
