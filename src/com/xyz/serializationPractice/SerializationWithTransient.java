package src.com.xyz.serializationPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationWithTransient {
    public static void main(String[] args) {
        Student2 s2 = new Student2(45,"Amartya",80);

        try {
            FileOutputStream file = new FileOutputStream("student2.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s2);
            System.out.println("success");
        }
        catch (Exception e) {
            System.out.println("exception while serializing:" +e.getMessage());
            e.printStackTrace();

        }

    }
}
