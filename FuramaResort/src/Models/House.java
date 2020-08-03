package Models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House extends Services{
    private String standardRoom;
    private String descriptionOfOtherAmenities;
    private int numberOfFloors;
    private static List<House> houseList = new ArrayList<>();

    public House(){

    }

    public House(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople
            , String typeOfRent, String standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public static List<House> getHouseList() {
        return houseList;
    }

    public static void setHouseList(List<House> houseList) {
        House.houseList = houseList;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOfOtherAmenities() {
        return descriptionOfOtherAmenities;
    }

    public void setDescriptionOfOtherAmenities(String descriptionOfOtherAmenities) {
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInformation() {
        System.out.println(
                "Service Id: " + super.getId() +
                        "; Service Name: " + super.getServiceName() +
                        "; Area Used: " + super.getAreaUsed() +
                        "; Rental Costs: " + super.getRentalCosts() +
                        "; Max Number Of People: " + super.getMaximumNumberOfPeople()+
                        "; Type Rent: " + super.getTypeOfRent() +
                        "; Room Standard: " + this.standardRoom +
                        "; Convenient Description: " + this.descriptionOfOtherAmenities +
                        "; Number Of Floors: " + this.numberOfFloors
        );
    }

    public static void addNewHouse(){
        String id, typeOfRent, serviceName, standardRoom, descriptionOfOtherAmenities;
        double areaUsed, rentalCosts;
        int maxPeople, numberFloors;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id: ");
        id = scanner.nextLine();
        System.out.print("Enter Services name's :");
        serviceName = scanner.nextLine();
        System.out.print("Enter Area:");
        areaUsed = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter rental Costs:");
        rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the maximum number of people:");
        maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rental type:");
        typeOfRent = scanner.nextLine();
        System.out.print("Enter room standard:");
        standardRoom = scanner.nextLine();
        System.out.println("Enter another comfort description:");
        descriptionOfOtherAmenities = scanner.nextLine();
        System.out.print("Enter number of floor:");
        numberFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(id, serviceName, areaUsed, rentalCosts, maxPeople, typeOfRent,
                standardRoom, descriptionOfOtherAmenities, numberFloors);
        houseList.add(house);
    }

    public void writeHouse(){
        final String FILE_HOUSE_PATH = "src/Data/House.csv";
        List<House> houseWriteList = House.getHouseList();
        FileWriter fis = null;
        BufferedWriter fos = null;
        try{
            fis = new FileWriter("src/Data/House.csv",true);
            fos = new BufferedWriter(fis);
            for (House house : houseList) {
                fos.append(house.getId());
                fos.append(",");
                fos.append(house.getServiceName());
                fos.append(",");
                fos.append(String.valueOf(house.getAreaUsed()));
                fos.append(",");
                fos.append(String.valueOf(house.getRentalCosts()));
                fos.append(",");
                fos.append(String.valueOf(house.getMaximumNumberOfPeople()));
                fos.append(",");
                fos.append(house.getTypeOfRent());
                fos.append(",");
                fos.append(house.getStandardRoom());
                fos.append(",");
                fos.append(house.getDescriptionOfOtherAmenities());
                fos.append(",");
                fos.append(String.valueOf(house.getNumberOfFloors()));
                fos.append("\n");
            }
            fos.flush();
            fos.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
