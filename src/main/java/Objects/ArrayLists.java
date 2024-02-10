package Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The arrayList is used to store objects
 * private, protected, and public is called the both visibility or accessibility modifier
 * final classes cannot be overriding or extended.
 */

public class ArrayLists {
    protected int i = 20;
    void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("London");
        list.add("miami");
        list.add("Tokyo");
        list.add("Japan");
        list.add(2, "Berlin");
        list.add(5, "Korea");

        list.set(2, "Germany");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        System.out.println();
        // print the reverse of the list
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
        list.remove(3);
//        ArrayList < new CircleStaticObject() >  = new ArrayList<>()

        System.out.println();

        String[] arrList = new String[]{"tay", "lane", "mon", "kicks"};
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(arrList));
        newList.add("Superman");
        newList.add("Batman");
        newList.remove(2);
        newList.contains("Tay"); // returns a boolean value;
        newList.set(4, "Jackie");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
        System.out.println();

        for (int j = newList.size() - 1; j >= 0; j--) {
            System.out.println(newList.get(j));
        }
//        String[] arrlist = new String[newList.size()];
        Integer[] arr = {1, 4, 6, 2, 0, 8, 1, 3, 5};
        ArrayList<Integer> listss = new ArrayList<>(Arrays.asList(arr));
        java.util.Collections.sort(listss);
        System.out.println(listss);
    }

}

class DistinctValue {
    void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<>();
        int value = 0;
        do {
            System.out.print("Enter an Integer (stop at zero: 0): ");
            value = sc.nextInt();

            if (!lists.contains(value) && value != 0) {
                lists.add(value);
            }
        } while (value != 0);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i) + " ");
        }
    }
}
// creating a  arrayList from arrays.
class Stack{
    private final ArrayList<Object> arrList = new ArrayList<>();
    public Object isEmpty(){
        return arrList.isEmpty();
    }
    public int getSize(){
        return arrList.size();
    }
    public Object peek(){
        return arrList.get(getSize() -1);
    }

    public Object pop(){
        Object o = arrList.get(getSize() -1);
        arrList.remove(getSize() -1);
        return o;
    }
    public Object push(Object o ){
        return arrList.add(o);
    }
    @Override
    public String toString(){
        return STR."stack :\{arrList.toString()}";
    }
}


