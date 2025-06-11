package _17_Stack_Memory_and_Heap_Memory;

public class _02_StackMemoryDemo2 {

    public static void main(String[] args) {

        System.out.println("Hi There");
        
        int defaultValue = 2;

        defaultValue = multiplyTwo(defaultValue);
        System.out.println(defaultValue);

        defaultValue = multiplyFour(defaultValue);
        System.out.println(defaultValue);
    }

    private static int multiplyTwo(int val) {

        val *= 2;
        return val;
    }

    private static int multiplyFour(int val) {

        val *= 4;
        return val;
    }
}
