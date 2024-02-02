package Handle_Strings.java;

public class stack {
    private static final int CAPACITY = 16;
    int[] elements;
    private int size;

    stack() {
        this(CAPACITY);

    }


    stack(int size) {
        elements = new int[size];
    }

    int isEmpty() {
        return size = 0;
    }

    void push(int sizes) {
        if (size > elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;

        }
        elements[size++] = sizes;
    }

    int peek() {
        return elements[size - 1];
    }

    int getSize() {
        return size;
    }

    int pop() {
        return elements[--size];
    }
}