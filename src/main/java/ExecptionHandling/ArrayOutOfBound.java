package ExecptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
 * requirements:
 * ■ Creates an array with 100 randomly chosen integers.
 * ■ Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the
 * message Out of Bounds
 * */

public class ArrayOutOfBound {

    void main(){
       Scanner sc = new Scanner(System.in);
        int[] randomIntegers = new int[100];
        for(int i = 0; i < 100; i++){
            randomIntegers[i] =(int) (Math.random()* 101);
        }

        try{
            int index = sc.nextInt();
            if(index >= 0 && index <=100){
                System.out.println("The index of the array is " + randomIntegers[index]);
            }else{
                System.out.println("Array out of bound");
            }
        }catch (Exception e){
            System.out.println("invalid input, please enter a valid index");
        }

        }




}