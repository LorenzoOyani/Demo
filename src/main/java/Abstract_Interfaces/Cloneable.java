package Abstract_Interfaces;

import java.util.ArrayList;

/**
 * The cloneable interface specifies that an object can be cloned.
 * An interface with an empty body is called a marker interface
 * To define a class that uses the clone interface, the class must override the clone method
 * in the Object class
 * A cloneNotSupportedException is thrown if a class fails to implement the cloneable interface
 * A class can implement multiple interfaces but can only extend one superclass
 * interfaces should be preferred to abstract classes because interfaces defines a common methods for different unrelated or related classes.
 * compare to abstract classes that will be needed to be overridden when extended given to the fact that Java does not support multiple inheritance
 *  but support multiple interfaces.
 * */

public class Cloneable {
void main(){
//    StringBuilder sb = new StringBuilder();
    ArrayList<Double> list1 = new ArrayList<>();
    list1.add(1.3);
    list1.add(4.5);
    list1.add(9.4);
    ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
    list2.add(3.4);
    list2.add(8.9);
    ArrayList<Double> list3 = list1;
    list3.remove(1.3);
    System.out.println("list1\n: " + list1);
    System.out.println("list2\n: " + list2);
    System.out.println("list3\n: " + list3);


}
}