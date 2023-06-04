package src.com.xyz.serializationPractice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomSerializtion {
    public static void main(String[] args) {
         User user = new User("1234","Ram","password");
        FileOutputStream file = null;
        ObjectOutputStream out = null;
        try {
            file = new FileOutputStream("user.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(user);
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(" exception in seriaization:" +e.getMessage());
            e.printStackTrace();
        }
    }
}
