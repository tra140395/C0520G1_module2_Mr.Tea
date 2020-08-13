package b17binaryfileandserialization.Demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(args[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            for (int i = 0; i < arr.length - 1; i++) {
                dataOutputStream.writeInt(arr[i]);
                dataOutputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
