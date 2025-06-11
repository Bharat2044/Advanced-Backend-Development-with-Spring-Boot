package _15_ArrayList_in_Java;

import java.util.ArrayList;

public class _02_PrintArrayListElements {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("C++");

        System.out.println(languages);

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println("----------------");

        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }
    }
}
