package b12collectionframework.Demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyMap2 {
    public static void main(String[] args) {
        Map<StudentMap,String> myLinkedHashMap = new LinkedHashMap<>();
        myLinkedHashMap.put(new StudentMap("Vuong", 25),"Top 1");
        myLinkedHashMap.put(new StudentMap("Dat", 26),"Top 4");
        myLinkedHashMap.put(new StudentMap("Dat", 26),"Top 3");
        myLinkedHashMap.put(new StudentMap("Hien", 24),"Top 2");

        for (Map.Entry<StudentMap, String> entryStudent: myLinkedHashMap.entrySet()) {
            System.out.println("key: " + entryStudent.getKey() + " value: " + entryStudent.getValue());
        }
    }

}
