package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeManager {
    static Map<Integer,Employee> map = new HashMap<>();
    public static void getEmployee(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/data/Employee.csv"));
            String line = null;
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null){
                arrTemp = line.split(",");
                Employee employee = new Employee(arrTemp[1],Integer.parseInt(arrTemp[2]),arrTemp[3]);
                map.put(Integer.parseInt(arrTemp[0]),employee);
            }
            Set set = map.keySet();
            for (Object key:set) {
                System.out.println(key+" : "+map.get(key));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
