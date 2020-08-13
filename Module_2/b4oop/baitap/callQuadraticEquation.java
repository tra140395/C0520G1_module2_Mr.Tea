package b4oop.baitap;

import java.util.Scanner;

public class callQuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pt co dang ax2 + bx + c = 0");
        System.out.println("Input a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The Equation has two roots: X1 = " + quadraticEquation.getRoot1() + " and X2= " +
                    quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The Equation has 2 nghiem bang nhau la X1=X2= " + quadraticEquation.getRoot1());
        } else
            System.out.println("The Equation has no Roots");
    }
}
