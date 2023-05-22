package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFillMethod {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("aaa");
        myList.add("bbb");

        System.out.println("original list:"+ myList);
        Collections.fill(myList,"sss");

        System.out.println("fill list:"+ myList);

    }
}
