package b16iotext.BaiTap;

import java.io.*;
import java.util.Arrays;

public class ReadListCountry {

    public static void ReadLstCountry(){
        File file = new File("src/b16iotext/BaiTap/ListCountry.csv");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null){
                arrTemp = line.split(",");
                System.out.println(arrTemp[arrTemp.length-1]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadLstCountry();
    }

}
