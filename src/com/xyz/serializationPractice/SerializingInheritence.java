package src.com.xyz.serializationPractice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingInheritence {
    public static void main(String[] args) {
        Dog d = new Dog(20);
        //Animal d = new Animal(10);
        try {
            FileOutputStream file = new FileOutputStream("dog.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(d);
            System.out.println("serializing successfull");
        }
        catch (Exception e){
            System.out.println("exception while seriaizing:" +e.getMessage());
            e.printStackTrace();
        }
    }
}
