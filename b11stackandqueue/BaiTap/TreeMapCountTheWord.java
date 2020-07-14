package b11stackandqueue.BaiTap;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapCountTheWord {
    public static void main(String[] args) {
        System.out.println("Input the Words: ");
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s");

        TreeMap<String,Integer> map = new TreeMap<>();
          for(int i = 0 ; i < strings.length ; i++){
              String key = strings[i].toLowerCase();
              int value = 1;
                  if(map.get(key)==null){
                      map.put(key,1);
                  } else {
                      for (String keyOfTree: map.keySet()) {
                          if(key.equals(keyOfTree)){
                              value = map.get(key).intValue();
                              value++;
                              map.put(key,value);
                              break;
                          }  else
                              map.put(key,value);

                      }
                  }

        }
        System.out.println(map);
    }

}
