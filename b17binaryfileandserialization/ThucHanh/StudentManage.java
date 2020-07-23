package b17binaryfileandserialization.ThucHanh;

import b17binaryfileandserialization.Demo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManage {
    public static final String FILE_PATH = "src/b17binaryfileandserialization/ThucHanh/studentofthuchanh.txt";

    public static void writeFile() throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            objectOutputStream = new ObjectOutputStream(fos);

            Student student1 = new Student("Toan", 25);
            Student student2 = new Student("Dat09", 29);
            Student student3 = new Student("Hai", 21);

            List<Student> studentList = new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);

            objectOutputStream.writeObject(studentList);
            objectOutputStream.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
        }
    }

    public static void readFile(){
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fis);
            List<Student> studentList = (List<Student>)objectInputStream.readObject();
            for (Student student:studentList) {
                System.out.println(student.getName()+" "+student.getAge()+" "+Student.sex);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // thao tac voi kieu nguyen thuy byte
    public static void write2() throws IOException{
        FileOutputStream fileIOutputStream = new FileOutputStream(FILE_PATH);
        DataOutputStream dataOutputStream = new DataOutputStream(fileIOutputStream);
        byte[] input = new byte[]{'c','o','d','e','g','y','m'};
        dataOutputStream.write(input, 0, 3);
        dataOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
        write2();
    }
}
