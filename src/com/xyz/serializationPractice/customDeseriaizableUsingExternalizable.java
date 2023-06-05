package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class customDeseriaizableUsingExternalizable {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("ext_user.txt");
            ObjectInputStream in = new ObjectInputStream(file);
           ExternalizedUser user = (ExternalizedUser) in.readObject();
            System.out.println(user);
        }
        catch (Exception e){
            System.out.println("exception inserialization");
            e.printStackTrace();
        }

    }
}
