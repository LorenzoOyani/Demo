package Triangle;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    void main() throws IllegalTraingleException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double input1 = sc.nextDouble();
        System.out.print("Enter side1: ");
        double input2 = sc.nextDouble();
        System.out.print("Enter side1: ");
        double input3 = sc.nextDouble();

        Triangle triangle = new Triangle(input1, input2, input3);
       double l =  triangle.getArea();
       System.out.println(l);

    }

    public Triangle(double side1, double side2, double side3) throws IllegalTraingleException {
        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTraingleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    public double getSide3() {
        return side3;
    }

//    public void setSide3(int side3) {
//        this.side3 = side3;
//    }

    public double getSide2() {
        return side2;
    }

//    public void setSide2(int side2) {
//        this.side2 = side2;
//    }

    public double getSide1() {
        return side1;
    }

//    public void setSide1(int side1) {
//        this.side1 = side1;
//    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    @Override
    public String toString() {
        return "Triangle sides is  " + "\nside = " + side1 + "\side2 = " + side2 + "side3 = " + side3;
    }
}