package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnionArrays {
    public static ArrayList<Integer> Union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> sets = new ArrayList<>(list1);
        sets.addAll(list2);
        return sets;

    }

    void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int value1, value2 = 0;
        System.out.print("Enter first list(exit at 0): ");
        do {

            value1 = sc.nextInt();
            if (value1 <= 5 && value1 >= 0) {
                list1.add(value1);
            }
        } while (value1 != 0);

        System.out.print("Enter second list(exit at 0): ");
        do {
            value2 = sc.nextInt();
            if (value2 <= 5 && value2 >= 0) {
                list2.add(value2);
            }

        } while (value2 != 0);


        ArrayList<Integer> union = Union(list1, list2);
        Collections.sort(union);

        System.out.println(STR."The union of the two arrayLists is \{union}");


    }
}