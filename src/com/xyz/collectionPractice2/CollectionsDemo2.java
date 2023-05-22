package src.com.xyz.collectionPractice2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        Person p1 = new Person(123,"Sagar");
        Person p2 = new Person(987,"Rajveer");
        Person p3 = new Person(567,"Shital");

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);
        //Collections.sort(list);

        PersonIdComparator pi = new PersonIdComparator();
        Collections.sort(list,pi);
        System.out.println(list);

    }
}
