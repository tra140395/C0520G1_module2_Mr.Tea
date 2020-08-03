package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room extends Services {
    private ServiceIncluded serviceIncluded;
    private static List<Room> roomList = new ArrayList<>();

    public Room(){

    }

    public Room(String id, String serviceName, double areaUsed, double rentalCosts
            , int maximumNumberOfPeople, String typeOfRent, ServiceIncluded serviceIncluded) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, typeOfRent);
        this.serviceIncluded = serviceIncluded;
    }

    public ServiceIncluded getServiceIncluded() { return serviceIncluded; }

    public void setServiceIncluded(ServiceIncluded serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }

    @Override
    public void showInformation() {
        System.out.println(
                "Service Id: " + super.getId() +
                        "; Service Name: " + super.getServiceName() +
                        "; Area Used: " + super.getAreaUsed() +
                        "; Rental Costs: " + super.getRentalCosts() +
                        "; Max Number Of People: " + super.getMaximumNumberOfPeople() +
                        "; Type Rent: " + super.getTypeOfRent() +
                        "; Service Included: " + this.serviceIncluded.toString());
    }

    public static void addNewRoom(){
        String id, typeOfRent, serviceName;
        double areaUsed, rentalCosts;
        int maxPeople;
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
        System.out.println("Enter the Name of service:");
        String name = scanner.nextLine();
        System.out.println("Enter the Name of service:");
        int unit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Name of service:");
        double money = Double.parseDouble(scanner.nextLine());
        ServiceIncluded serviceIncluded = new ServiceIncluded(name,unit,money);
        Room room = new Room( id, serviceName, areaUsed, rentalCosts, maxPeople, typeOfRent,serviceIncluded);
        roomList.add(room);
    }

}
