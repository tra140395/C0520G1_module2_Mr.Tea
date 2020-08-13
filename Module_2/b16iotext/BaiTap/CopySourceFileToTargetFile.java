package b16iotext.BaiTap;

import java.io.*;
import java.util.Scanner;

public class CopySourceFileToTargetFile {
    public static void CopyFile(String SourcePath){
        try {
            File file = new File(SourcePath);
            File file1 = new File("src/b16iotext/BaiTap/TargetFile.txt");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file1));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter1.write(line + "\n");
                System.out.println("Da sao chep "+ line);
            }
            bufferedWriter1.close();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File Source khong ton tai!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SourcePath: ");
        String SourcePath = scanner.nextLine();
//        System.out.println("Nhap targetPath: ");
//        String TargetPath = scanner.nextLine();

        CopyFile(SourcePath);
    }

}
