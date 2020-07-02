package b1introductioninjava.thuchanh;

import java.util.Scanner;

public class GiaiPtBac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        double solution;
        if(a!=0){
            solution =-b/a;
            System.out.println("pt có 1 solution là: "+solution);
        }else
            System.out.println("pt vô nghiệm");

    }
}
