package models;

import commons.ReadFileCustomer;
import commons.SortByNameCustomer;
import commons.UserRegexExceptionCustomer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Customer {
    String name, birthDay, gender, email, typeCustomer, address;
    int cmnd, phone;
    Services services = null;
    private static List<Customer> customerList = new ArrayList<>();

    public Customer() {

    }

    public Customer(String name, String birthDay, String gender, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
    }

    public Customer(String name, String birthDay, String gender, String email,
                    String typeCustomer, String address, int cmnd, int phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.cmnd = cmnd;
        this.phone = phone;
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        Customer.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        String name = UserRegexExceptionCustomer.RegexInputNameCustomer();
        System.out.println("Enter the customer's birthday: ");
        String birthday = UserRegexExceptionCustomer.RegexInputBirthdayCustomer();
        System.out.println("Enter the gender of the customer: ");
        String gender = UserRegexExceptionCustomer.RegexInputGenderCustomer();
        System.out.println("Enter the customers ID number: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the customer cmnd: ");
        int cmnd = UserRegexExceptionCustomer.RegexInputCmndCustomer();
        System.out.println("Enter the customer email: ");
        String email = UserRegexExceptionCustomer.RegexInputEmailCustomer();
        System.out.println("Enter the customers type: ");
        String type = scanner.nextLine();
        System.out.println("Enter the customers address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, birthday, gender, email, type, address, cmnd, phone);
        customerList.add(customer);
    }

    public static void writeCustomer() throws IOException {
        List<Customer> customerListWrite = Customer.getCustomerList();
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        final String CUSTOMER_PATH = "src/data/Customer.csv";
        try {
            fileWriter = new FileWriter(CUSTOMER_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerListWrite) {
                bufferedWriter.append(customer.getName());
                bufferedWriter.append(",");
                bufferedWriter.append(customer.getBirthDay());
                bufferedWriter.append(",");
                bufferedWriter.append(customer.getGender());
                bufferedWriter.append(",");
                bufferedWriter.append(customer.getEmail());
                bufferedWriter.append(",");
                bufferedWriter.append(customer.getTypeCustomer());
                bufferedWriter.append(",");
                bufferedWriter.append(customer.getAddress());
                bufferedWriter.append(",");
                bufferedWriter.append(String.valueOf(customer.getCmnd()));
                bufferedWriter.append(",");
                bufferedWriter.append(String.valueOf(customer.getPhone()));
                bufferedWriter.append("\n");
            }
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            bufferedWriter.close();
            fileWriter.close();
        }
    }

    public static void sortCustomerList() {
        Collections.sort(customerList, new SortByNameCustomer());
        for (Customer customer : customerList) {
            System.out.println(customer.getName() + " " + customer.getBirthDay() + " " + customer.getGender()
                    + " " + customer.getEmail() + " " + customer.getTypeCustomer() + " " + customer.getAddress() + " "
                    + customer.getCmnd() + " " + customer.getPhone());
        }
    }
}



