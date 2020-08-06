package mainmenu;

import word.Service;

import java.util.Scanner;

public class Controller {
    public static void displayMainMenu() {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Look up words");
        System.out.println("2. Additional definition");
        System.out.println("3. Delete word");
        System.out.println("4. Export dictionary database");
        int num = 0;
        while (num != -1) {
            System.out.println("Enter your action: ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1: {
                    service.lookUpWord();
                    break;
                }
                case 2: {
                    service.additionalDefinition();
                    break;
                }
                case 3: {
                    service.dropWord();
                    break;
                }
                case 4: {
                    service.copyAllWordToFileText();
                    break;
                }

            }
        }
    }


}
