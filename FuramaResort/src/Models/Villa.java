package models;

import commons.RegexService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Villa extends Services {

    private String standardRoom;
    private String descriptionOfOtherAmenities;
    private double poolArea;
    private int numberOfFloors;
    private static List<Villa> villaList = new ArrayList<>();

    public Villa(){

    }

    public Villa(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople
            , String typeOfRent, String standardRoom, String descriptionOfOtherAmenities, double poolArea, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public static List<Villa> getVillaList() {
        return villaList;
    }

    public static void setVillaList(List<Villa> villaList) {
        Villa.villaList = villaList;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
                        "; Area Pool: " + this.poolArea +
                        "; Number Of Floors: " + this.numberOfFloors
        );
    }

    public static void addNewVilla(){
        String id, typeOfRent, serviceName, standardRoom, descriptionOfOtherAmenities;
        double areaUsed, rentalCosts, poolArea;
        int maximumNumberOfPeople, numberOfFloors;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id: ");
        id = RegexService.RegexInputIdOfVilla();
        System.out.print("Enter Services's name :");
        serviceName = RegexService.RegexInputNameService();
        System.out.print("Enter Area:");
        areaUsed = RegexService.RegexInputArea();
        System.out.print("Enter rental Costs:");
        rentalCosts = RegexService.RegexInputCosts();
        System.out.print("Enter the maximum number of people:");
        maximumNumberOfPeople = RegexService.RegexNumberOfPeople();
        System.out.print("Enter rental type:");
        typeOfRent = scanner.nextLine();
        System.out.print("Enter room standard:");
        standardRoom = scanner.nextLine();
        System.out.println("Enter another comfort description:");
        descriptionOfOtherAmenities = scanner.nextLine();
        System.out.print("Enter pool area:");
        poolArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number of floor:");
        numberOfFloors = RegexService.RegexNumberOfFloor();
    Villa villa = new Villa(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, typeOfRent,
            standardRoom, descriptionOfOtherAmenities, poolArea, numberOfFloors);
    villaList.add(villa);
    }

  public static void writeVilla(){
       final String FILE_VILLA_PATH = "src/Data/Villa.csv";
       List<Villa> villaWriteList = Villa.getVillaList();
      FileWriter fis = null;
      BufferedWriter fos = null;
      try{
          fis = new FileWriter(FILE_VILLA_PATH,true);
          fos = new BufferedWriter(fis);
          for (Villa villa : villaWriteList) {
              fos.append(villa.getId());
              fos.append(",");
              fos.append(villa.getServiceName());
              fos.append(",");
              fos.append(String.valueOf(villa.getAreaUsed()));
              fos.append(",");
              fos.append(String.valueOf(villa.getRentalCosts()));
              fos.append(",");
              fos.append(String.valueOf(villa.getMaximumNumberOfPeople()));
              fos.append(",");
              fos.append(villa.getTypeOfRent());
              fos.append(",");
              fos.append(villa.getStandardRoom());
              fos.append(",");
              fos.append(villa.getDescriptionOfOtherAmenities());
              fos.append(",");
              fos.append(String.valueOf(villa.getPoolArea()));
              fos.append(",");
              fos.append(String.valueOf(villa.getNumberOfFloors()));
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
