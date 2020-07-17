package b13ThuatToanTimKiem.BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheMaxString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi you muốn kiểm tra: ");
        String str = scanner.nextLine();
        ArrayList<String> myArr = new ArrayList<>();
        String temp ="";
        int index = 0;
        for(int i = index; i < str.length() - 2; i++){
            if(str.charAt(i) < str.charAt(i+1)){
                temp += str.charAt(i);
            }else {
                myArr.add(temp);
                temp = "";
            }
        }
        System.out.println(myArr);
    }
}
