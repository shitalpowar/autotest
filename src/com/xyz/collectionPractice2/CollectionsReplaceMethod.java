package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReplaceMethod {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("zzz");
        myList.add("1235");
        myList.add("kjiu");
        myList.add("aaa");
        myList.add("bbb");

       // Collections.replaceAll(myList, "bbb","ddd");
        System.out.println(myList);

        //Collections.reverse(myList);
        System.out.println(myList);
       // Collections.shuffle(myList);
        System.out.println(myList);

        //Collections.swap(myList,1,2);
        System.out.println(myList);

        Collections.rotate(myList,2);
        System.out.println(myList);



    }
}
