package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0, and invokes this method to return the largest number in the input.
 */


public class MaxElement {
    public static Integer max(ArrayList<Integer> lists){
        int maxValue = 0;
        if(lists.isEmpty()){
            return null;
        }
        maxValue = lists.get(0);
        for(int i =1; i < lists.size(); i++) {
            if(lists.get(i) > maxValue){
                maxValue = lists.get(i);
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        ArrayList<Integer>lists = new ArrayList<>();

        do{
            System.out.print("Enter a int value(exit at 0): ");
            value = sc.nextInt();
            if(value != 0) {
                lists.add(value);
            }

        }while(value != 0);
        System.out.println("The max value of the bunch is " + max(lists));
    }


}