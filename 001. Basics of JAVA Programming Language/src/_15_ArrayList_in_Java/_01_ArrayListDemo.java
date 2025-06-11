package _15_ArrayList_in_Java;

import java.util.ArrayList;

public class _01_ArrayListDemo {

    public static void main(String[] args) {

//        ArrayList<Type> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<String> languages = new ArrayList<>();

        // Add Elements
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add(1, "C#");

        // Print ArrayList
        System.out.println(languages);

        // Print Length
        System.out.println(languages.size());

        // Access Elements
        System.out.println(languages.get(0));
        System.out.println(languages.get(1));

        // Change Element
        languages.set(1, "C++");
        System.out.println(languages);

        // Remove Element
        languages.remove(2);
        System.out.println(languages);

        languages.remove("C++");
        System.out.println(languages);

        System.out.println(languages.size());

        languages.add("Swift");
        languages.add("SQL");
        System.out.println(languages);
    }
}
