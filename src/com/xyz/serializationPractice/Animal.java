package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Animal  {

    int i =10;

    public Animal() {

    }

    public Animal(int i) {
        super();

        this.i = i;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "i=" + i +
                '}';
    }
}
