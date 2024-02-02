/**
 * (The Queue class) Section 10.6 gives a class for Stack. Design a class named
 * Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
 * elements are retrieved in a last-in first-out fashion. In a queue, the elements are
 * retrieved in a first-in first-out fashion. The class contains:
 * ■ An int[] data field named elements that stores the int values in the
 * queue.
 * ■ A data field named size that stores the number of elements in the queue.
 * ■ A constructor that creates a Queue object with default capacity 8.
 * ■ The method enqueue(int v) that adds v into the queue.
 * Programming Exercises 403
 * ■ The method dequeue() that removes and returns the element from the
 * queue.
 * ■ The method empty() that returns true if the queue is empty.
 * ■ The method getSize() that returns the size of the queue.
 */

public class Queue {
    private int[] elements;
    private int size = 0;
    private int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
    }

    Queue() {
        this(8);
        elements = new int[size];
    }


    public void enqueue(int v) {
        if (size >= elements.length - 1) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size]= v;
        size++;
    }

    public void deQueue() {
        if(size > 0) {
            for(int  i = 0; i < size- 1; i++){
                elements[i] = elements[i + 1];
            }
            elements[size - 1] =0;
            size--;
        }else {
            System.out.println("Queue is empty, cannot dequeue");
        }
    }

    public boolean isEmpty() {
     return size == 0;
    }

    public int getSize() {
        return size;
    }

}