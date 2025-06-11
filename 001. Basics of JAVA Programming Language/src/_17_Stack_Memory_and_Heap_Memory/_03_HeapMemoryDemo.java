package _17_Stack_Memory_and_Heap_Memory;

import java.util.ArrayList;

public class _03_HeapMemoryDemo {

    public static void main(String[] args) {

        int x = 10;
        System.out.println(x);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
