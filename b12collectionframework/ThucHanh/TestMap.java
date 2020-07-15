package b12collectionframework.ThucHanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
           myHashMap.put("An",15);
           myHashMap.put("Nam",21);
           myHashMap.put("Thu",23);
           myHashMap.put("Hoa",16);
           System.out.println("Display entries in HashMap");
           System.out.println(myHashMap + "\n");
        System.out.println("---------------------------");

        Map<String, Integer> myTreeMap = new TreeMap<>(myHashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(myTreeMap);
        System.out.println("---------------------------");

        Map<String, Integer> myLinkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        myLinkedHashMap.put("An",15);
        myLinkedHashMap.put("Nam",21);
        myLinkedHashMap.put("Thu",23);
        myLinkedHashMap.put("Hoa",16);
        System.out.println("\nThe age for " + "Thu is " + myLinkedHashMap.get("Thu"));
    }

}
