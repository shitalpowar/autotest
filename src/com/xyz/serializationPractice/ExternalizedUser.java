package src.com.xyz.serializationPractice;

import java.io.*;

public class ExternalizedUser implements Externalizable {
    String name;
    String userId;
    String password;
    public ExternalizedUser() {
        System.out.println("no arg constructor invoked");
    }

    @Override
    public String toString() {
        return "ExternalizedUser{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public ExternalizedUser(String name, String userId, String password) {
        super();
        this.name = name;
        this.userId = userId;
        this.password = password;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal() invoked");
        out.writeObject(name);
        out.writeObject(userId);
        out.writeObject(password);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal() invoked");
         name = (String) in.readObject();
         userId = (String) in.readObject();
         password = (String) in.readObject();

    }
}
