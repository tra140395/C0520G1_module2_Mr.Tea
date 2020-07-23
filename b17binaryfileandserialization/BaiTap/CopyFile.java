package b17binaryfileandserialization.BaiTap;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the Source's path:");
        String path = scanner.nextLine();
        try {
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream("src/b17binaryfileandserialization/BaiTap/TargetFile.txt");
            int i = 0;
            int countByte = 0;
            do {
                i = fis.read();
                if (i != -1) {
                    fos.write(i);
                    countByte++;
                }
            } while (i != -1);
            System.out.println("Number of Byte is: "+ countByte);
            fos.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}