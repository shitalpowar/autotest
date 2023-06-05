package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AssociationINDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("association.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Person p1 = (Person) in.readObject();
            //Address a1 = (Address) in.readObject();
            System.out.println(p1);
        }
        catch (Exception e)
        {
            System.out.println(" exceotion while...");
            e.printStackTrace();
        }
    }
}
