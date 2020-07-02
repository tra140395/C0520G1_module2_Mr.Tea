package b5access_modifier.thuchanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Static_Method_Student.change();//calling change method
//creating objects
        Static_Method_Student s1 = new Static_Method_Student(111, "Hoang");
        Static_Method_Student s2 = new Static_Method_Student(222, "Khanh");
        Static_Method_Student s3 = new Static_Method_Student(333, "Nam");
//calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
