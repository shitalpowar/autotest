package src.com.xyz.collectionPractice2;

import java.util.*;

public class CollectionsDisjointMethod {
    public static void main(String[] args) {

        List<String> mylList = new ArrayList<>();
        mylList.add("aa");
        mylList.add("aa");
        mylList.add("dd");

        Set<String> mySet = new HashSet<>();
        mySet.add("dd");
        mySet.add("ee");
        mySet.add("ff");

        System.out.println(Collections.disjoint(mylList,mySet));

    }
}
