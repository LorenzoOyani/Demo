package Generics;

//import Objects.T;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Generics enables you to detect errors at compile time rather than at runTime.
 * Generics makes you parametrized types, with these capabilities, you can define a method with generic type
 * and the compiler will replace with concrete type.
 * Replacing a Generic type is call generic instantiation
 * A single parameter like <E>, <T>. are used as generic types.
 * Generic type must be reference type.
 * int, char, double cannot be used on the generic type.
 * autoBoxing in Generics
 * A generic type can be specified as a subType of another type. such generics is called bounded type.
 * A generic class or interface used without specifying a concrete type is called a Raw type.
 * */

public class Generics <E>{
    private ArrayList<E>  list =new ArrayList<>();

    void main(){
        Generics<String> stack1 = new Generics<String>();
        stack1.push("John");
        stack1.push("2345");
        stack1.push("yawn");
        System.out.println(stack1);

        Generics<Integer> stack2 = new Generics<Integer>();
        stack2.push(345);
        stack2.push(3422);
        stack2.push(678);
        System.out.println(stack2);
    }
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return  list.get(getSize() -1);
    }
    public void push(E o){
        list.add( o);
    }
    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() -1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString(){
        return "stack\n :" + list.toString();
    }
}