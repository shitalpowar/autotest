package src.com.xyz.enumPractice;

import java.util.EnumMap;

enum S{

    SMALL,MEDIUM,LARGE,EXTRALARGE;
    S(){

    }

}

public class EnumMaoDemo {
    public static void main(String[] args) {

        EnumMap<S,Integer> myMap = new EnumMap<>(S.class);
        //myMap.put(S.EXTRALARGE);

    }

}



