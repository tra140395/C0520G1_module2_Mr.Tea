package Controllers;

import Models.House;
import Models.Villa;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainControllers {
   Scanner scanner = new Scanner(System.in);

    public MainControllers() {
    }

    public void displayMainMenu() {
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        int choice = 0;
        while (choice != 7) {
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    addNewServices();
                    break;
                }
                case 2: {
                    showServices();
                    break;
                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {

                }
                case 7: {
                    System.exit(0);
                }
            }
        }

    }

    public void addNewServices() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        int choice = 0;
        while (choice != 5){
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    Villa villa = new Villa();
                    villa.addNewVilla();
                    villa.writeVilla();
                    break;
                }
                case 2:{
                    House house = new House();
                    house.addNewHouse();
                    house.writeHouse();
                    break;
                }
                case 3:{

                }
                case 4:{
                 displayMainMenu();
                 break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        }

    }

    public void showServices(){
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Name Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");

        int choice = 0;
        while (choice != 8){
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: {
                        File file = new File("src/Data/Villa.csv");
                        show(file);
                        break;
                }
                case 2: {
                        File file = new File("src/Data/House.csv");
                        show(file);
                        break;
                }
                case 3: {
                        File file  = new File("src/Data/Room.csv");
                        show(file);
                        break;
                }
                case 4: {

                }
                case 5: {

                }
                case 6: {

                }
                case 7: {
                        displayMainMenu();
                        break;
                }
                case 8: {
                        System.exit(0);
                }
            }
        }

    }

    public String show(File file){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
               System.out.println(Arrays.toString(arrTemp));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Done";
    }

    public static void main(String[] args) {
        MainControllers mainControllers = new MainControllers();
        mainControllers.displayMainMenu();
    }

}
