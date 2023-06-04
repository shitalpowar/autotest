package src.com.xyz.serializationPractice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AssociationInSeriaization {
    public static void main(String[] args) {
        Street s1 = new Street(10,"Azad");
        Address a1 = new Address(416113,"Warana","India",s1);
        Person p1 = new Person(123,"Ram",a1);

        FileOutputStream file = null;
        ObjectOutputStream out = null;
        try {
            file = new FileOutputStream("association.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(a1);
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println("Exception in Serialization:" +e.getMessage());
            e.printStackTrace();
        }
    }
}
