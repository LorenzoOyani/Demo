package Generics;

public class GenericSort {

    public static void printList(Object[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }

    }

    public static <E extends Comparable<E>> void Sort(E[] objects) {
        E currentMin;
        int currentIndex = 0;


        for (int i = 0; i < objects.length - 1; i++) {
            currentMin = objects[i];
            currentIndex = i;

            for (int j = i + 1; j < objects.length; j++) {
                if (currentMin.compareTo(objects[j]) > 0) {
                    currentMin = objects[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                objects[currentIndex] = objects[i];
                objects[i] = currentMin;
            }
        }


    }

    void main() {
        Integer[] intArr = {2, 5, 1, 3, 4, 7, 8};
        Double[] doubleArr = {2.4, 0.9, 8.3, 9.2, 7.9};
        String[] string = {"Aeron", "beast", "cruising"};

        GenericSort.<Integer>Sort(intArr);
        GenericSort.<Double>Sort(doubleArr);
        GenericSort.<String>Sort(string);

        System.out.print("The sorted Arrays are: ");
        printList(intArr);
        System.out.print("The sorted Arrays are: ");
        printList(doubleArr);
        System.out.print("The sorted Arrays are: ");
        printList(string);

    }
}