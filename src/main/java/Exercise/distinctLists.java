package Exercise;

//import Objects.ArrayLists;

import java.util.ArrayList;

import java.util.*;

public class distinctLists {
    void main(){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();

        list.add(value);
        removeDuplicates(list);
        System.out.print("The distinct values are: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }


    public static void removeDuplicates(ArrayList<Integer>list) {
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(Objects.deepEquals(list.get(i), list.get(j + 1))){
                    list.remove(j);
                }
            }
        }
    }
    }