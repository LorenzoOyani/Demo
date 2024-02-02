package Objects;

import static java.lang.Long.sum;

public class ArrayOfObjects {
    public static void main(String[] args) {
        CircleStaticObject[] circleArray;
        circleArray = createArray();
        printArr(circleArray);
    }
    public static CircleStaticObject[] createArray() {
    CircleStaticObject[] circleArray = new CircleStaticObject[10];
    for(int  i =0; i < circleArray.length; i++) {
        circleArray[i] = new CircleStaticObject((int)(Math.random() * 10));
    }
    return circleArray;
    }
    public static void printArr(CircleStaticObject[] circle){
        System.out.printf("%-30s %-15s %n", "Radius", "Area");
        for(int i = 0; i < circle.length; i++) {
            System.out.printf("%-30d %-15f %n", circle[i].getRadius(), circle[i].getArea());

        }
        System.out.println("-------------------------------------\n");
        String t = "The total area of the circle is ";
        System.out.printf("%-30s%-15d%n",t,sum(circle));

    }

    private static int sum(CircleStaticObject[] circle) {
        int sum = 0;
        for (int i = 0; i < circle.length; i++) {
            sum  += (int) circle[i].getArea();
        }
        return sum;
    }
}
//Learnt.
// Array of reference objects;
// Data Field Encapsulation
//The String constructor has 13 constructors and more tha  40 methods to manipulate strings
