package src.com.xyz.serializationPractice;

import java.io.Serializable;

public class Address implements Serializable {
    int pin;
    String city;
    String country;
    Street street;

    public Address(int pin, String city, String country, Street street) {
        this.pin = pin;
        this.city = city;
        this.country = country;
        this.street = street;
    }

    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street=" + street +
                '}';

    }
}
