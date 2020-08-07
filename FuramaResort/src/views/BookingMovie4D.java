package views;

import commons.ReadFileCustomer;
import models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookingMovie4D {
    static Queue<Customer> movieList = new LinkedList<>();
    public static void addMovieList(){
        ReadFileCustomer.readFileCustomer();
        System.out.println("Enter the customer u want to add: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        movieList.offer(Customer.getCustomerList().get(number));
        for (Customer customer: movieList) {
            System.out.println("List of movie 4d: "+ customer);
        }

    }
}
