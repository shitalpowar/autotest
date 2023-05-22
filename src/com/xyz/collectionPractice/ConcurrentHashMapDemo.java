package src.com.xyz.collectionPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();
        hm.put("Sagar", 999);
        hm.put("Shital", 888);
        hm.put("xyz",999);
        //hm.put(null, 888);
        //hm.put("www", null);


        System.out.println(hm);

    }
}
