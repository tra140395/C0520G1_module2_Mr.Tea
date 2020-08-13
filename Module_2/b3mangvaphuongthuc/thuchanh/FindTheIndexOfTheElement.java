package b3mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class FindTheIndexOfTheElement {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten can tim kiem: ");
        String name =scanner.nextLine();
        boolean ischuoi=false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(name)){
                System.out.println(name + "trùng with chuỗi in vị trí "+(i+1));
                ischuoi = true;
            }
        }
        if(!ischuoi){
            System.out.println("not thấy");
        }
    }
}
