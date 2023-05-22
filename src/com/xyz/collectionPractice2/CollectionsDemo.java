package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("AAA");
        System.out.println("original list :" + list);

        Collections.sort(list);
        System.out.println("sorted list :" + list);
    }
}
