package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomDeserialization {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream("user.txt");

            ObjectInputStream in = new ObjectInputStream(file);
            User user = (User) in.readObject();
            System.out.println(user);

        } catch (Exception e) {
            System.out.println("Exception while Deserialization ");
            e.printStackTrace();
        }
    }
}
