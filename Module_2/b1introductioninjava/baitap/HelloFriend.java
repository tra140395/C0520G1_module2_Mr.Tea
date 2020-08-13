package b1introductioninjava.baitap;

import java.util.Scanner;

public class HelloFriend {
    public static void main(String[] args) {
        System.out.println("Input your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("My best friend!!!");
    }
}
