package b5access_modifier.thuchanh;

public class Static_Method_Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
//constructor to initialize the variable
   Static_Method_Student (int r,String n){
        rollno = r;
        String name = n;
    }
    //static method to change the value of static variable
    static void change(){
        college = "CODEGYM";
    }
    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

