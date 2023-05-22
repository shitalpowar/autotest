package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MinMaxMethods {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("aaa");
        myList.add("bbb");
        System.out.println("original list:" + myList);
        System.out.println(Collections.min(myList));
        System.out.println(Collections.max(myList));

        HashSet hs = new HashSet<>();
        hs.add("aaa");
        hs.add("zzz");
        hs.add("aaa");
        hs.add("bbb");

        System.out.println(hs);


    }
}
