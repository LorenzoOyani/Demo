package Generics;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */

public class Distinct_Generics {
    public static <E> ArrayList<E> removeDuplicate(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    list.remove(j);
                    j--;

                }
            }
        }
        return list;
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String value = "";
        boolean continued;


        do {
            System.out.println("Enter a value (or press 1 to exit): ");
            value = sc.nextLine();
            if (!value.equalsIgnoreCase("exit")) {
                list.add(value);
                continued = true;
            } else {
                continued = false;
            }

        } while (continued);

        removeDuplicate(list);

        System.out.println(STR."The distinct elements \{list}");


    }
}