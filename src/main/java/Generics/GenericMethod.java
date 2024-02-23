package Generics;

public class GenericMethod {
     public static void main(String[] args){
          Integer[] integers = {3,6,7,8,9,0,3};
          String[] string = {"leo", "john", "thomas"};
          print(integers);
          print(string);
     }
    public static <E> void print(E[] list ){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
//            System.out.println();
        }
    }

}