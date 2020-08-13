package b4oop.vidu;

public class TestSvien {
    private String StudentID;
    private int studentYears;
    private float studentAVGMark;
    private String faculty;

    public TestSvien() {
    }

    public TestSvien(String studentID, int studentYears, float studentAVGMark, String faculty) {
        StudentID = studentID;
        this.studentYears = studentYears;
        this.studentAVGMark = studentAVGMark;
        this.faculty = faculty;
    }

    public TestSvien(String studentID, String faculty) {
        StudentID = studentID;
        this.faculty = faculty;
    }

//    public String toString(String studentID, String faculty) {
//        this.StudentID = studentID;
//        return "TestSvien{" +
//                "StudentID='" + StudentID + '\'' +
//                ", faculty='" + faculty + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "TestSvien{" +
                "StudentID='" + StudentID + '\'' +
                ", studentYears=" + studentYears +
                ", studentAVGMark=" + studentAVGMark +
                ", faculty='" + faculty + '\'' +
                '}';
    }
    //    @Override
//    public String toString() {
//        return "TestSvien{" +'\n'+
//                "StudentID='" + StudentID +'\''+"\n"+
//                ", studentYears=" + studentYears +'\n'+
//                ", studentAVGMark=" + studentAVGMark +'\n'+
//                ", faculty='" + faculty + '\'' +"\n"+
//                '}';
//    }
//    @Override
//    public String toString() {
//        return "TestSvien{" +
//                "StudentID='" + StudentID + '\'' +
//                ", studentYears=" + studentYears +
//                ", studentAVGMark=" + studentAVGMark +
//                ", faculty='" + faculty + '\'' +
//                '}';
//    }

    public void goToSchool() {

    }

    public void study() {

    }

    public void doExample() {

    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getStudentYears() {
        return studentYears;
    }

    public void setStudentYears(int studentYears) {
        this.studentYears = studentYears;
    }

    public float getStudentAVGMark() {
        return studentAVGMark;
    }

    public void setStudentAVGMark(float studentAVGMark) {
        this.studentAVGMark = studentAVGMark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
