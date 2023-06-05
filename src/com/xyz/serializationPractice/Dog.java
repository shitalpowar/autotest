package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Dog extends Animal implements Serializable  {

    Dog(int i) {

        super(i);
    }
    int j = 20;

    @Override
    public String toString() {
        return "Dog{" +
                "j=" + j +
                '}';
    }
}
