package b7abstractandinterface.thuchanh;

import b5access_modifier.baitap.Circle;

import java.util.Arrays;
import java.util.Comparator;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6,"yellow");
        circles[1] = new Circle(3.5);
        circles[2] = new Circle();
        System.out.println("Pre-sorted: ");
        for(Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("Pre-sorted: ");
        for(Circle circle:circles){
            System.out.println(circle);
        }
    }
}
