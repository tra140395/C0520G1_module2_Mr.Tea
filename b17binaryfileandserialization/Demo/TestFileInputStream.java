package b17binaryfileandserialization.Demo;

import java.io.*;

public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            while (true){
                System.out.println(dataInputStream.readInt());
            }

        }catch (EOFException e){

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}