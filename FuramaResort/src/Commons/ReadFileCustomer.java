package commons;

import models.Customer;

import java.io.*;

public class ReadFileCustomer {

    public static void readFileCustomer(){
        File file = new File("src/models/Customer.java");
        if(!file.exists()){
            System.err.println("File Not Found !!");
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arrTemp;
            int id = 0;
            while ((line = bufferedReader.readLine()) != null){
                arrTemp = line.split(",");
                Customer customer = new Customer(arrTemp[0], arrTemp[1],arrTemp[2],arrTemp[3],arrTemp[4],
                        arrTemp[5],Integer.parseInt(arrTemp[6]),Integer.parseInt(arrTemp[7]));
                Customer.getCustomerList().add(customer);
                Customer.setCustomerList(Customer.getCustomerList());
            }
            for (Customer customer1 : Customer.getCustomerList()) {
                System.out.println(id+""+ customer1.getName()+" "+customer1.getCmnd()+" "+ customer1.getEmail());
                id++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
