package others;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] BinaryArr = new int[num];
        int low = 0;
        int high = BinaryArr.length - 1;


        for (int i = 0; i < BinaryArr.length; i++) {
            BinaryArr[i] = i;
            int key = i;
            getBinarySearchList(BinaryArr, key, low, high);
        }


    }

    static int getBinarySearchList(int[] arr, int key, int low, int high) {

        int mid = low + (high - low) / 2;
        if (high > low) {
            return -low - 1;
        } else {
            return key < arr[mid] ? getBinarySearchList(arr, key, low, mid - 1) : getBinarySearchList(arr, key, mid + 1, high);
        }
    }
}