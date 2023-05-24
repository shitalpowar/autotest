package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUnmodifiable1 {
    public static void main(String[] args) {

        List<String> returnedList = method1();

      returnedList.add("dd");
    }

    private static List<String> method1(){

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        return Collections.unmodifiableList(list);

    }
}
