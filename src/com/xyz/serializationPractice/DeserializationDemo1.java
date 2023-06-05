package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo1 {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("tudent.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            Student deserializestd = (Student) in.readObject();
            System.out.println(deserializestd);
        }
        catch (Exception e){
            System.out.println("exception while de....");
            e.printStackTrace();
        }

    }
}
