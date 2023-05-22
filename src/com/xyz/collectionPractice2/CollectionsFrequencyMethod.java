package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFrequencyMethod {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ccc");
        myList.add("aaa");

        int count = Collections.frequency(myList,"aaa");
        System.out.println(count);

    }
}
