package src.com.xyz.collectionPractice2;

public class Person implements Comparable<Person>{
    int id;
    String name;
    public Person(){
        super();
    }
    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.id == o.id)
            return 0;
        else if (this.id > o.id)
            return 1;
        else
            return -1;




    }
}
