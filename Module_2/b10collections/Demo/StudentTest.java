package b10collections.Demo;

import java.util.ArrayList;

import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1,"VSC Trà",25);
        Student student2 = new Student(2,"Diễm Thúy Bùi",25);
        Student student3 = new Student(3, "Nguyễn Văn An", 20);
        Student student4 = new Student(4,"Bạch Đà Sơn", 21);

        ArrayList myList = new ArrayList();
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.add(student4);

        for(Object object:myList){
            System.out.println(object);
        }

        System.out.println("---------");
        Collections.sort(myList);

        for (Object object:myList) {
            System.out.println(object);
        }
    }

}
