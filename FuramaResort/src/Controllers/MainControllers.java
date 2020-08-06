package controllers;

import commons.ReadFileCustomer;
import commons.ShowFile;
import models.*;
import views.FilingCabinetsOfEmployee;
import views.Movie4d;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class MainControllers {
    Scanner scanner = new Scanner(System.in);

    public MainControllers() {
    }

    public void displayMainMenu() throws IOException {
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Show customer movie list");
        System.out.println("8. Find Employee");
        System.out.println("9. Exit");
        int choice = 0;
        while (choice != 9) {
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
                    Customer.addNewCustomer();
                    Customer.writeCustomer();
                    break;
                }
                case 4: {
                    ReadFileCustomer.readFileCustomer();
                    Customer.sortCustomerList();
                    break;
                }
                case 5: {
                    addNewBooking();
                    break;
                }
                case 6: {
                    EmployeeManager.getEmployee();
                    break;
                }
                case 7: {
                    Movie4d.addMovieList();
                    break;
                }
                case 8: {
                    FilingCabinetsOfEmployee.addEmployeeToStack();
                    FilingCabinetsOfEmployee.findEmployee();
                    break;
                }
                case 9: {
                    System.exit(0);
                }
            }
        }

    }

    public void addNewServices() throws IOException {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        int choice = 0;
        while (choice != 5) {
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    Villa.addNewVilla();
                    Villa.writeVilla();
                    break;
                }
                case 2: {
                    House.addNewHouse();
                    House.writeHouse();
                    break;
                }
                case 3: {
                    Room.addNewRoom();
                    Room.writeRoom();
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }

    }

    public void showServices() throws IOException {
        MainControllers mainControllers = new MainControllers();
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Name Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");

        int choice = 0;
        while (choice != 8) {
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    File file = new File("src/Data/Villa.csv");
                    ShowFile.showVilla(file);
                    break;
                }
                case 2: {
                    File file = new File("src/Data/House.csv");
                    ShowFile.showHouse(file);
                    break;
                }
                case 3: {
                    File file = new File("src/Data/Room.csv");
                    ShowFile.showRoom(file);
                    break;
                }
                case 4: {
                    TreeSet<Villa> villaTreeSet = new TreeSet<>();
                    BufferedReader bufferedReader = null;
                    try {
                        bufferedReader = new BufferedReader(new FileReader("src/Data/Villa.csv"));
                        String line = null;
                        String[] arrTemp;
                        while ((line = bufferedReader.readLine()) != null) {
                            arrTemp = line.split(",");
                            Villa villa = new Villa(arrTemp[0], arrTemp[1], Double.parseDouble(arrTemp[2]),
                                    Double.parseDouble(arrTemp[3]), Integer.parseInt(arrTemp[4]),
                                    arrTemp[5], arrTemp[6], arrTemp[7], Double.parseDouble(arrTemp[8]), Integer.parseInt(arrTemp[9]));
                            villaTreeSet.add(villa);
                        }
                        for (Villa villa : villaTreeSet) {
                            villa.showInformation();
                        }
                        mainControllers.displayMainMenu();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 5: {
                    TreeSet<House> houseTreeSet = new TreeSet<>();
                    BufferedReader bufferedReader = null;
                    try {
                        bufferedReader = new BufferedReader(new FileReader("src/Data/House.csv"));
                        String line = null;
                        String[] arrTemp;
                        while ((line = bufferedReader.readLine()) != null) {
                            arrTemp = line.split(",");
                            House house = new House(arrTemp[0], arrTemp[1], Double.parseDouble(arrTemp[2]),
                                    Double.parseDouble(arrTemp[3]), Integer.parseInt(arrTemp[4]),
                                    arrTemp[5], arrTemp[6], arrTemp[7], Integer.parseInt(arrTemp[9]));
                            houseTreeSet.add(house);
                        }
                        for (House house : houseTreeSet) {
                            house.showInformation();
                        }
                        mainControllers.displayMainMenu();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 6: {
                    // maybe error!!! yahahahhahahaha... When i got dev 2 i will comeback and fix this hard bug.......
                    // maybe bug in ShowFile.showRoom()
                    TreeSet<Room> roomTreeSet = new TreeSet<>();
                    roomTreeSet.addAll(Room.getRoomList());
                    for (Room room : roomTreeSet) {
                        room.showInformation();
                    }
                    mainControllers.displayMainMenu();
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

    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        ReadFileCustomer.readFileCustomer();
        System.out.println("Enter your id of Customer you wanna to booking for : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("1.Booking Villa");
        System.out.println("2.Booking House");
        System.out.println("3.Booking Room");
        int choice = 0;
        while (choice != -1) {
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    File file = new File("src/data/Booking.csv");
                    ShowFile.showVilla(file);
                    System.out.println("Enter the number of Service you want to booking for: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.append(Customer.getCustomerList().get(id).getName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(Customer.getCustomerList().get(id).getCmnd()));
                        bufferedWriter.append(",");
                        bufferedWriter.append(Customer.getCustomerList().get(id).getEmail());
                        bufferedWriter.append(",");
                        bufferedWriter.append(Villa.getVillaList().get(number).getId());
                        bufferedWriter.append(",");
                        bufferedWriter.append(Villa.getVillaList().get(number).getServiceName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(Villa.getVillaList().get(number).getAreaUsed()));
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Done!");

                }
                case 2: {
                    File file = new File("src/data/Booking.csv");
                    ShowFile.showHouse(file);
                    System.out.println("Enter the number of Service you want to booking for: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.append(Customer.getCustomerList().get(id).getName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(Customer.getCustomerList().get(id).getCmnd()));
                        bufferedWriter.append(",");
                        bufferedWriter.append(Customer.getCustomerList().get(id).getEmail());
                        bufferedWriter.append(",");
                        bufferedWriter.append(House.getHouseList().get(number).getId());
                        bufferedWriter.append(",");
                        bufferedWriter.append(House.getHouseList().get(number).getServiceName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(House.getHouseList().get(number).getAreaUsed()));
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Done!");

                }
                case 3: {
                    File file = new File("src/data/Booking.csv");
                    ShowFile.showRoom(file);
                    System.out.println("Enter the number of Service you want to booking for: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.append(Customer.getCustomerList().get(id).getName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(Customer.getCustomerList().get(id).getCmnd()));
                        bufferedWriter.append(",");
                        bufferedWriter.append(Customer.getCustomerList().get(id).getEmail());
                        bufferedWriter.append(",");
                        bufferedWriter.append(Room.getRoomList().get(number).getId());
                        bufferedWriter.append(",");
                        bufferedWriter.append(Room.getRoomList().get(number).getServiceName());
                        bufferedWriter.append(",");
                        bufferedWriter.append(String.valueOf(Room.getRoomList().get(number).getAreaUsed()));
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Done!");

                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        MainControllers mainControllers = new MainControllers();
        mainControllers.displayMainMenu();
    }

}
