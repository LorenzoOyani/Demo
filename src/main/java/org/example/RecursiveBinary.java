package org.example;
import java.util.*;

public class RecursiveBinary {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 7, 8, 9, 0};
        int key = 5;
        int l = Binary(arr, key);
        System.out.println("The key is "+ l);
    }

    public static int Binary(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        return recursiveBinary(arr, key, low, high);

    }

    static int recursiveBinary(int[] arr, int key, int low, int high) {
        Arrays.sort(arr);
        int mid = (low + high) / 2;
        if(high < low) {
            return -low - 1;
        } else
            return key < arr[mid] ? recursiveBinary(arr, key, low, mid - 1) : recursiveBinary(arr, key, mid + 1, high);


    }
}