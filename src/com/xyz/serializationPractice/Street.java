package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Street implements Serializable {

    int streetNo;
    String streetName;

    public Street() {
        super();

    }

    public Street(int streetNo, String streetName) {
        super();
        this.streetNo = streetNo;
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetNo=" + streetNo +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
