package mainmenu;

import word.Service;

import java.util.Scanner;

public class Controller {
    public static void displayMainMenu() {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add new word");
        System.out.println("2. Look up words");
        System.out.println("3. Additional definition");
        System.out.println("4. Delete word");
        System.out.println("5. Export dictionary database");
        int num = 0;
        while (num != -1) {
            System.out.println("Enter your action: ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1: {
                    service.writeWord(service.addNewWord(),true);
                    break;
                }
                case 2: {
                    service.lookUpWord();
                    break;
                }
                case 3: {
                    service.additionalDefinition();
                    break;
                }
                case 4: {
                    service.dropWord();
                    break;
                }
                case 5: {
                    service.copyAllWordToFileText();
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        Controller.displayMainMenu();
    }


}
