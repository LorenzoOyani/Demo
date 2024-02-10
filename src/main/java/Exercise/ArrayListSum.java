package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 */

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lists = new ArrayList<>();

        double value = 0;
        do {
            System.out.print("Enter a double value(exit at 0): ");
            value = sc.nextDouble();
            if (value > 0 && value <= 5) {
                lists.add(value);
            }
        } while (value != 0);
        System.out.println("The sum of the array in the list is:  " + sum(lists));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return Math.round(sum);
    }
}