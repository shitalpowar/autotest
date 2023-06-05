package src.com.xyz.serializationPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MultipleObjectSerialization {
    public static void main(String[] args) {

        Student s1 = new Student(12,"AAA");
        Student2 s2 = new Student2(23,"BBB",60);
        Teacher t1 = new Teacher(10,"CCC","History");
        Teacher t2 = new Teacher(8,"RRR","Maths");

        try {
            FileOutputStream file = new FileOutputStream("Manyobj.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(t1);
            out.writeObject(t2);
            System.out.println("objects serialized successfully");
        }
        catch (Exception e){

            System.out.println("exception while serializing objects:" +e.getMessage());
            e.printStackTrace();

        }
    }
}
