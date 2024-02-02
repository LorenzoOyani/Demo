import java.util.Arrays;
import java.util.Scanner;

public class AclassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] arr = new String[n.length()];

        for(int i = 0; i <n.length(); i ++) {
            arr[i] = String.valueOf(n.charAt(i));
        }
        PrintUpperCase(arr);
    }

    static void PrintUpperCase(String[] arr) {
        String upperCase = " ";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] !=null && !arr[i].isEmpty()) {
                upperCase += arr[i].toUpperCase();
            }

        }
        System.out.println("The upperCase characters are :" + upperCase );
    }
}

class isRecursivePalindrome {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String n = input.nextLine();


        printRecursivePalindrome(n, 0);
    }

    static void printRecursivePalindrome(String s, int index) {
        char characters = '/';
        if (index < s.length()) {
            characters = s.charAt(index);
        } else if (Character.isLetter(characters)) {
            char upperCase = Character.toUpperCase(characters);
            System.out.println("The upperCase character is "+ upperCase);
        } else {
            printRecursivePalindrome(s, index + 1);
        }

    }
}

class ReverseArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] arr = new int[input];
        int n = arr.length;

        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        for(int  i = 0; i < n; i++) {
            temp[i] = arr[input - 1 - i];
        }



for(int i = 0; i < n; i++){
    System.out.println(arr[i] +"");
}

    }
}


public  void main(String[] args) {
    int[] arr = {2, 4 ,1, 5, 6, 7, 8 ,3, 0};
    MergeSort ms = new MergeSort(arr);
    System.out.print(("---------\n input \n-------------"));
    ms.display();
    ms.sort();

    System.out.print(("-------\n After MergeSort \n-----------"));
    ms.display();

}
public static class MergeSort {
    int[] arr;
    MergeSort(int[] arr) {
        this.arr = arr;
    }

    public  void sort() {
        sort(0, arr.length - 1);
    }

    public void sort(int low, int high) {
        int middle;
        if(low < high) {
            middle = (low + high) / 2;
            sort(low, middle - 1);
            sort(middle + 1, high);
            merge(low, middle, high);
        }

    }

    public void merge(int left, int middle, int right) {
        int n1 = middle -left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for(int  i =0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for(int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle+ 1 + j];
        }
        int i = 0;
        int  j = 0;
        int k =  1;

        while(i < leftArray.length && j < rightArray.length) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[i];
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;

        } while(j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }
    public void display() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(STR."\{arr[i]} ");
        }
    }



}
