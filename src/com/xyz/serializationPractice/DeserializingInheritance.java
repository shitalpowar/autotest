package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializingInheritance {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("dog.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Dog d = (Dog) in.readObject();
            System.out.println(d);
        }
        catch (Exception e){
            System.out.println("Exception while deserializing:" +e.getMessage());
            e.printStackTrace();
        }
    }
}
