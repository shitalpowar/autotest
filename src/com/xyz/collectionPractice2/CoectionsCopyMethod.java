package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CoectionsCopyMethod {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("aaa");
        myList.add("bbb");


        ArrayList<String> destination = new ArrayList<>();
        destination.add("a");
        destination.add("g");
        destination.add("f");
        destination.add("w");

        Collections.copy(destination,myList);
        System.out.println("copied list:" + destination);
    }
}
