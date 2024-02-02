package Objects;
import java.util.Date;

public class CircleStaticObject {


    public static void printCircle(CircleStaticObject c1) {
        System.out.println(c1.getRadius() );
    }
    public static void main(String[] args) {
        System.out.println(CircleStaticObject.countNumberOfObjects);

        CircleStaticObject c1 = new CircleStaticObject(5);
       System.out.println(c1.setRadius(c1.getRadius() * (int) 1.1));
        printCircle(c1);
        System.out.println();
        CircleStaticObject c2 = new CircleStaticObject();
        System.out.println(c2.getRadius());
        CircleStaticObject.getCircleStaticObject();

        int c = CircleStaticObject.countNumberOfObjects;
        System.out.println(c);
        c1.radius = 9;
        c2.radius = 90;
        int  l =CircleStaticObject.getCircleStaticObject();
        System.out.println(c2.radius);
        System.out.println(l);

    }
    int radius;
    static  int countNumberOfObjects = 0;
    CircleStaticObject(int radius) { // instantiate with the object.
        this.radius = radius;
    }
    public CircleStaticObject() { // instantiate with a value
        radius = 1;
        countNumberOfObjects++;
    }

    public int CircleStaticObject(int newRadius) {
            return radius = newRadius;
    }
    static int getCircleStaticObject() {
        return countNumberOfObjects;
    }
    double getArea() {
        return  radius * radius * Math.PI;
    }
    public int setRadius(int newRadius) {
         return radius = (newRadius >= 0) ? newRadius : 0;
    }
    public int getRadius() {
        return radius;
    }
}

class tests {
    public static void main(String[] args) {
        CircleStaticObject c = new CircleStaticObject(5);
        int n = 1;
        printCircle(c,n);

    }
    static void printCircle(CircleStaticObject c, int n) {
        for(int  i =0 ; i < 8; i++) {
            System.out.printf("%-15d, %-15d", c.getRadius() + 1, n++);
        }

    }
}
class Count {
    int count;
    public Count(int c) {
        count = c;
    }
    public Count() {
        count = 1;
    }
    public void incrementing() {
        count++;
    }

    public static void main(String[] args) {
        Count c = new Count();
        int times = 1;
        for(int  i =0; i < 100; i++) {
            increment(c, times);

            System.out.println(STR."count : \{i + 1} " + c.count);
            System.out.println("times "+ times);
        }

    }
    private static void increment(Count count, int times) {
        count.incrementing();
        times++;
    }

}
 class Test {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = " +
                t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " +
                t2.i + " and j = " + t2.j);
    }
}
class T {
    static int i = 0;
    int j = 0;
    T() {
        i++;
        j = 1;
    }
}
 class test {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date) {
        date = new Date();
    }
}
class Testss {
    private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println(STR."i + j is \{i + j}");
        }
        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}