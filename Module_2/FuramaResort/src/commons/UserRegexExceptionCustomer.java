package commons;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegexExceptionCustomer {
    static Scanner scanner = new Scanner(System.in);
    public static String RegexInputNameCustomer() {
        String regex = "^([A-Z]([a-z])* ?)+$";
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (!Pattern.matches(regex, name)) {
                    throw new NameException("Your name must be in the format: Abc Abc" +
                            "\nEnter again: ");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String RegexInputEmailCustomer() {
        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
        String mail;
        while (true) {
            try {
                mail = scanner.nextLine();
                if (!Pattern.matches(regex, mail)) {
                    throw new EmailException("The email must be in the format: abc@abc.abc" +
                            "\nEnter again: ");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return mail;
    }

    public static String RegexInputGenderCustomer() {
        String regex = "(male|female|unknown)";
        String gender;
        while (true) {
            try {
                gender = scanner.nextLine();
                gender = gender.toLowerCase();
                if (!Pattern.matches(regex, gender)) {
                    throw new GenderException("No gender found" +
                            "\nEnter again: ");
                }
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    public static int RegexInputCmndCustomer() {
        String regex = "^[\\d]{3} [\\d]{3} [\\d]{3}$";
        int cmnd;
        while (true) {
            try {
                cmnd = Integer.parseInt(scanner.nextLine());
                if (!Pattern.matches(regex,String.valueOf(cmnd))) {
                    throw new CmndException("The cmnd number must be in the format: xxx xxx xxx" +
                            "\nEnter again: ");
                }
                break;
            } catch (CmndException e) {
                System.out.println(e.getMessage());
            }
        }
        return cmnd;
    }

    public static String RegexInputBirthdayCustomer() {
        String regex = "^[0-9]{2}/[0-9]{2}/(19[0-9][0-9]-20(00|01|02))$";
        String birthday;
        while (true) {
            try {
                birthday = scanner.nextLine();
                if (!Pattern.matches(regex, birthday)) {
                    throw new BirthdayException("The birthday must be in the format: xx/xx/xxxx" +
                            "\nEnter again: ");
                }
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        return birthday;
    }



}
