package b12collectionframework.Demo;

import org.jetbrains.annotations.NotNull;

public class StudentMap implements Comparable<StudentMap> {
    private String name;
    private int age;

    public StudentMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       StudentMap otherStudent = (StudentMap) obj;
       if(this.name.equals(otherStudent.getName()))
           return true;
       else
           return false;
    }

    @Override
    public String toString() {
        return "StudentMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull StudentMap studentMap) {
        return this.age - studentMap.getAge();
    }
}
