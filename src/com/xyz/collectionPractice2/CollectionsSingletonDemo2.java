package src.com.xyz.collectionPractice2;

import java.util.*;

public class CollectionsSingletonDemo2 {
    public static void main(String[] args) {

        List <String> myList = Collections.singletonList("ooo");
        System.out.println(myList);
       // myList.add("ggg");

        Set<String> mySet = Collections.singleton("sss");
        System.out.println(mySet);
        //mySet.add("kkk");

        Map<String,Integer> myMap = Collections.singletonMap("www",123);
        System.out.println(myMap);
       // myMap.put("aaa",678);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,"sagar");
        map2.put(2,"Shital");
        System.out.println(map2);

    }
}
