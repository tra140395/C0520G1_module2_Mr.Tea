package b12collectionframework.Demo;

import java.util.Map;
import java.util.TreeMap;

public class MyMap3 {
    public static void main(String[] args) {
        Map<StudentMap,String> myTreeMap = new TreeMap<>();
        myTreeMap.put(new StudentMap("Dai", 26),"Top 3");
        myTreeMap.put(new StudentMap("Vuong", 25),"Top 2");
        myTreeMap.put(new StudentMap("Dai", 26),"Top 4");
        myTreeMap.put(new StudentMap("Hien", 24),"Top 1");

        for (Map.Entry<StudentMap, String> entryStudent: myTreeMap.entrySet()) {
            System.out.println("key: " + entryStudent.getKey() + " value: " + entryStudent.getValue());
        }
    }

}
