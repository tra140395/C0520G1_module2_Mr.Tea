package b16iotext.Demo;

import java.io.*;
import java.util.Arrays;

public class WriteATestFile {
    public static void writeFileHello() {
        try {
            FileWriter writer = new FileWriter("src/b16iotext/Demo/hello.txt");
            writer.write("Hello ! \n");
            writer.write("Hello 1 \n");
            writer.write("Hello 2 \n");
            writer.write("Hello 3 \n");
            writer.write("Hello 4 \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileHello() {
        try {
            FileReader fileReader = new FileReader("src/b16iotext/Demo/hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileStudent2() {
        try {
            FileReader fileReader = new FileReader("src/b16iotext/Demo/student2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                System.out.println(Arrays.toString(arrTemp));

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileStudent2(Student student) {
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/b16iotext/Demo/student2.txt", true));
            bufferedWriter.write(student.getName() + "," + student.getAge() + "\n");
            //            StringBuffer stringBuffer = new StringBuffer();
            //            stringBuffer.append(student.getName()).append(",").append(student.getAge()).append("\n");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public static void main (String[]args){
            writeFileHello();
            readFileHello();
            System.out.println();
            System.out.println("Student 2: ");
            writeFileStudent2(new Student("Chuong Coach",29));
            writeFileStudent2(new Student("Toan Structor", 27));
            writeFileStudent2(new Student("Hien Tutor",25));
            readFileStudent2();

        }
    }
    class Student{
    private String name;
    private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
