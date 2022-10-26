package by.it_academy.lesson9.task2;


import java.util.HashMap;
import java.util.Map;

public class Abbreviation {
    Map<String, String> map = new HashMap<>();


    void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }


    String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    void printAbbreviations() {
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
    }

    void printAbbreviationsWere(String text) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getKey());
            }
        }
    }

    void printExplanationOfAbbreviationsWhere(String text) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println((entry.getValue()));
            }
        }
    }
}
