package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonListDemo {
    public static void main(String[] args) {

        String intList[] = {"one","four","three","two"};

        List list = new ArrayList(Arrays.asList(intList));
        System.out.println("list value before:" + list);

        list = Collections.singletonList("only one element");
        System.out.println("list value after:" + list);
        list.add("five");
        System.out.println(list);

    }
}
