package b19stringandreget.BaiTap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONE_CODE = "^[0-9]{2}$";
    private static final String PHONE_NUMBER = "^0[0-9]{9}$";

    public static boolean checkValidate(String phoneCode, String phoneNumber) {
        boolean check = false;
        Pattern pattern = Pattern.compile(PHONE_CODE);
        Pattern pattern1 = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phoneCode);
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        if (matcher.matches() && matcher1.matches()) {
            return check = true;
        } else {
            return check = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the phone's code: ");
        String phoneCode = scanner.nextLine();
        System.out.println("Input the phone's number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println(checkValidate(phoneCode,phoneNumber));
    }
}
