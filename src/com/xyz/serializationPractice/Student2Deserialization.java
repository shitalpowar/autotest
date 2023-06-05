package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Student2Deserialization {
    public static void main(String[] args) {
        try {
        FileInputStream file = new FileInputStream("student2.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        Student2 deseriaizedstd2 = (Student2) in.readObject();
            System.out.println(deseriaizedstd2);


        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
