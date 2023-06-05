package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerializationUsingExternalizable {
    public static void main(String[] args) {
        ExternalizedUser user = new ExternalizedUser("Ram","123","password");
        FileOutputStream file = null;
       ObjectOutputStream out = null;
        try {

            file = new FileOutputStream("ext_user.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(user);
            System.out.println("success");

        }
        catch(Exception e){

            System.out.println("exception inserialization");
            e.printStackTrace();
        }
        finally {
            try {
                out.close();
                file.close();
            }
            catch (IOException e){
                System.out.println("error while closing the resource");
                e.printStackTrace();
            }
        }
    }
}
