package src.com.xyz.serializationPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student(21,"Ram");
        FileOutputStream file = null;
        ObjectOutputStream out = null;

        try {
            file = new FileOutputStream("Student.ser");
            out = new ObjectOutputStream(file);

            out.writeObject(s1);
            System.out.println("success");

            file = new FileOutputStream("Student.txt");
            out = new ObjectOutputStream(file);

            out.writeObject(s1);

        } catch (Exception e) {
            System.out.println("exception while serializing the object!! :" +e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                out.close();
                file.close();

            }
            catch (IOException e){
                System.out.println("error while closing the resources ");
                e.printStackTrace();
            }
        }
    }
}
