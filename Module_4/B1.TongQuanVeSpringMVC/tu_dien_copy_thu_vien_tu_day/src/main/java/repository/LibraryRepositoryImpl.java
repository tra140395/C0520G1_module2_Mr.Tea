package repository;

import java.util.HashMap;
import java.util.Map;

public class LibraryRepositoryImpl implements LibraryRepository{
    private static Map<String,String> libraryList;

    static {
       libraryList = new HashMap<>();
       libraryList.put("ngu","idiot");
       libraryList.put("thong minh","smart");
       libraryList.put("may tinh","computer");
       libraryList.put("quat","pan");
    }

    @Override
    public String findByKey(String key) {
        return libraryList.get(key);
    }
}
