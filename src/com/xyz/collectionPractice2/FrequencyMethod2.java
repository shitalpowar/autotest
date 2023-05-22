package src.com.xyz.collectionPractice2;

import java.util.*;

public class FrequencyMethod2 {
    public static void main(String[] args) {

        String i = "India is my country India is beautiful";
        List<String> words = Arrays.asList(i.split(" "));
        System.out.println(words);
       // int count = Collections.frequency(words,"is");
        //System.out.println(count);
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
        for (String w :wordsSet )
        {
         //   System.out.println(w + " occured " + Collections.frequency(words, w )+ "times" );
            System.out.println(w + " = " + Collections.frequency(words,w));

        }
    }
}
