package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Student2 implements Serializable {

    int rollNo;
    //transient final String name ="zzz";
     transient final String name;
     //final String name;
    //transient String name;
    final static String schoolName = "wvw";
    int marks;

    public Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
