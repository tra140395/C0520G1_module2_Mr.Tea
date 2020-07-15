package b12collectionframework.Demo;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<StudentMap,String> myHashMap = new HashMap<>();
        myHashMap.put(new StudentMap("Hien", 24),"Top 1");
        myHashMap.put(new StudentMap("Vuong", 25),"Top 2");
        myHashMap.put(new StudentMap("Dat", 26),"Top 3");
        myHashMap.put(new StudentMap("Dat", 26),"Top 4");

        for (Map.Entry<StudentMap,String> entryStudent: myHashMap.entrySet()) {
            System.out.println("key: "+ entryStudent.getKey()+" Value: "+entryStudent.getValue());
        }

    }

}
