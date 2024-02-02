package others;

import java.io.PrintWriter;

public class Stack {
    private final int CAPACITY_SIZE = 16;
    private int size;
    private int[] elements;


    Stack(int capacity) {
        elements = new int[capacity];

    }

    public Stack() {
        this(16);
    }

    public static void main(String[] args) {
        PrintWriter print = new PrintWriter(System.out);
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int input = sc.nextInt();
        Stack stacks = new Stack();

           print.println( String.valueOf(stacks.push(input)));;
        while(!stacks.isEmpty()){
            print.println(stacks.pop());
        }
    }

    public boolean push(int element) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = element;
        return  true;
    }

    public int getSize() {
        return size;
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean pop() {
        size--;

        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}