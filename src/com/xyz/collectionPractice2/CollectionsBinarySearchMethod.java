package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBinarySearchMethod {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("aaa");
        myList.add("bbb");
        myList.add("rrr");
        myList.add("aaa");

        System.out.println("original mylist:"+ myList);

        int i = Collections.binarySearch(myList,"zzz");
        System.out.println(i);

    }

}
