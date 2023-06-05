package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    Address adrress;

    public Person() {

    }

    public Person(int id, String name, Address adrress) {
        this.id = id;
        this.name = name;
        this.adrress = adrress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adrress=" + adrress +
                '}';
    }
}
