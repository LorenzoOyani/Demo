package CircleObjects;

import java.util.Date;
import java.util.Scanner;

public class Triangle extends GeometricCircle {

    double side1;
    double side2;
    double side3;





    Triangle(int side1, int side2, int side3, String color, boolean filled) {
        super(color, filled);
        setColor(color);
        setIsFilled(filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    Triangle() {
        this(1, 1, 1, "red", false);
    }

    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value(integer) : ");
        int value1 = sc.nextInt();
        System.out.print("Enter a value(integer) : ");
        int value2 = sc.nextInt();
        System.out.print("Enter a value(integer) : ");
        int value3 = sc.nextInt();
        System.out.print("Enter a color(String) : ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(value1, value2, value3,color,  false);
        System.out.println(STR."The area is: \{triangle.getArea()}");
        System.out.println(STR."The perimeter is: \{triangle.getPerimeter()}");
        System.out.println(STR."The triangle was created:  \{triangle.setCreatedDate()}");
        System.out.println(STR."The color is: \{triangle.setColor(color)}");
        System.out.println("The total string is: " + triangle.toString());
//        System.out.println();

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return Math.pow(2, -1) * side3 * side2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return "Triangle :  side1 = " + side1 + " side2 = " + side2 + " side3 =  " + side3;
    }



}