package src.com.xyz.collectionPractice2;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if(p1.id == p2.id)
            return 0;
        else if (p1.id>p2.id)
            return 1;
        else
            return -1;


    }
}
