package b19stringandreget.BaiTap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
 public static final String CLASS_REGEX = "^[ABC][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Class's name: ");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            System.out.println("Ok");
        } else {
            System.out.println("Fail name!");
        }
    }

}
