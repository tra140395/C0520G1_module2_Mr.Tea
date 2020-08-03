package Commons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {
    static Scanner scanner = new Scanner(System.in);

    public static String RegexInputIdOfVilla() {
        String Regex = "SVVL-[\\d]{4}";
        String id;
        do {
            id = scanner.nextLine();
            if (!Pattern.matches(Regex, id)) {
                System.out.println("The ID is not the correct format");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, id));

        return id;
    }
    public static String RegexInputIdOfRoom() {
        String Regex = "SVHO-[\\d]{4}";
        String id;
        do {
            id = scanner.nextLine();
            if (!Pattern.matches(Regex, id)) {
                System.out.println("The ID is not the correct format");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, id));

        return id;
    }
    public static String RegexInputIdOfHouse() {
        String Regex = "SVRO-[\\d]{4}";
        String id;
        do {
            id = scanner.nextLine();
            if (!Pattern.matches(Regex, id)) {
                System.out.println("The ID is not the correct format");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, id));

        return id;
    }

    public static String RegexInputNameService() {
        String Regex = "[A-Z][a-z0-9\\s]*";
        String name;
        do {
            name = scanner.nextLine();
            if (!Pattern.matches(Regex, name)) {
                System.out.println("The service name must be capitalized with first letters " +
                        "the following characters shall be normal characters");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, name));

        return name;
    }

    public static double RegexInputArea() {
        double area;
        boolean check = true;
        do {
            area = Double.parseDouble(scanner.nextLine());
            if (area < 30) {
                System.out.println("The area phai lon hon 30m2");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);
        return area;
    }

    public static double RegexInputCosts(){
        double cost;
        boolean check = true;
        do {
            cost = Double.parseDouble(scanner.nextLine());
            if (cost < 0) {
                System.out.println("The costs must be > 0");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);

        return cost;
    }

    public static int RegexNumberOfPeople() {
        int number;
        boolean check = true;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 20) {
                System.out.println("The number of people must be >0 and < 20");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);

        return number;
    }

    public static String RegexInputServicesIncluded() {
        String Regex = "(massage|karaoke|food|drink|car)";
        String serviceIncluded;
        do {
            serviceIncluded = scanner.nextLine();
            if (!Pattern.matches(Regex, serviceIncluded)) {
                System.out.println("No free services found");
                System.out.println("Enter again: ");
            }
        } while (!Pattern.matches(Regex, serviceIncluded));
        return serviceIncluded;
    }

    public static int RegexNumberOfFloor() {
        int number;
        boolean check = true;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("The number of floor must be lon hon 0");
                System.out.println("Enter again: ");
                check = false;
            } else
                check = true;
        } while (!check);

        return number;
    }


}
