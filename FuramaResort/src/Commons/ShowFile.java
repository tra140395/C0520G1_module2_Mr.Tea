package commons;

import java.io.*;
import java.util.Arrays;

public class ShowFile {
    public ShowFile(){

    }
    public String show(File file){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                System.out.println(Arrays.toString(arrTemp));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Done";
    }


}
