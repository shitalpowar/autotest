package src.com.xyz.serializationPractice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    String userId;
    String userName;
    transient String password;

    public User() {
        super();
    }

    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    private void writeObject(ObjectOutputStream oos) throws Exception {
        System.out.println("custum writeObject() invoked!!");
        oos.defaultWriteObject();
        String epwd = "123@" + password;
        oos.writeObject(epwd);
    }
    private void readObject(ObjectInputStream ois) throws Exception {
        System.out.println("custom readObject() invoked!!!");
        ois.defaultReadObject();

        String epwd = (String)ois.readObject(); // take encrypted pwd decrypt it

        password = epwd.substring(4); // set decrypted pwdoos.writeObject(epwd);
    }

}
