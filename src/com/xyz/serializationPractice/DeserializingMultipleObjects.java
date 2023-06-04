package src.com.xyz.serializationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializingMultipleObjects {
    public static void main(String[] args) {


        try {
            FileInputStream file = new FileInputStream("Manyobj.txt");
            ObjectInputStream in = new ObjectInputStream(file);

           while (in.available()==0){
                Object o;
                        o= in.readObject();
                if (o instanceof Teacher)
                {
                    Teacher t = (Teacher) o;
                    System.out.println(t);
                  // break;
                }
                if(o instanceof Student){
                    Student s = (Student) o;
                    System.out.println(s);
                }
                if (o instanceof Student2){
                    Student2 d = (Student2) o;
                    System.out.println(d);
                }

                }


            System.out.println("out of the while");

    }
        catch (Exception e)
        {
            System.out.println("exception while deserializing stream... ");
            e.printStackTrace();
    }

    }
}
