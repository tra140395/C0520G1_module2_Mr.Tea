package b16iotext.ThucHanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
                System.out.println(line);
            }
            bufferedReader.close();
            System.out.println("Sum is: "+sum);
        }catch (Exception e){
            System.err.println("File ko ton tai hoac noi dung loi!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        readFileText(path);
    }

}
