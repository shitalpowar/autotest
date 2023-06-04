package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Student implements Serializable {

    int rollNo;
    String name;

    public Student() {
        super();
    }

    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
