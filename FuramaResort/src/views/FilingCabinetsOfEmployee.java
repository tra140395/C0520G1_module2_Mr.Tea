package views;

import models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinetsOfEmployee {
    static Stack<Employee> stack = new Stack<>();

    public static Stack<Employee> getStack() {
        return stack;
    }

    public static void setStack(Stack<Employee> stack) {
        FilingCabinetsOfEmployee.stack = stack;
    }

    public static void addEmployeeToStack() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/data/Employee.csv"));
            String line = null;
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                Employee employee = new Employee(arrTemp[1], Integer.parseInt(arrTemp[2]), arrTemp[3]);
                stack.push(employee);
            }
            System.out.println(" List of Employee: " + stack);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findEmployee() {
        System.out.println("Enter the name of employer you want to find: ");
        Scanner scanner = new Scanner(System.in);
        String nameFind = scanner.nextLine();
        try {
            while (FilingCabinetsOfEmployee.getStack().peek() != null) {
            if (nameFind.contains(FilingCabinetsOfEmployee.getStack().peek().getName())) {
                System.out.println(FilingCabinetsOfEmployee.getStack().pop());
            }else {
                FilingCabinetsOfEmployee.getStack().pop();
            }
        }

    }catch (Exception e){

        }
}
}
