package b10collections.BaiTap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student1 {
            private int id;
            private String name;

            public Student1() {
            }

            public Student1(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedListSetting<Student1> studentMyLinkedList = new MyLinkedListSetting<>();
        Student1 student1 = new Student1(1, "An");
        Student1 student2 = new Student1(2, "Nam");
        Student1 student3 = new Student1(3, "Thanh");
        Student1 student4 = new Student1(4, "Hai");
        Student1 student5 = new Student1(4, "Hoa");
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addFirst(student3);

        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student1 student = (Student1) studentMyLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
