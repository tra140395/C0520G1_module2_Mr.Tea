package b7abstractandinterface.thuchanh;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.0,"yellow");
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle();

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Pre-sorted:");
        for(ComparableCircle circle:circles)
            System.out.println(circle);
    }
}
