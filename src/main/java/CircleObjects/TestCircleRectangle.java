package CircleObjects;

public class TestCircleRectangle extends SimpleGeometryCircle {
    void main() {
        CircleFromSimpleGeometryCircle Circles = new CircleFromSimpleGeometryCircle(50);
        System.out.println(STR."The circle is \{Circles.getArea()}");
        System.out.println(STR."The color is \{Circles.setColor("red")}");
        System.out.println(STR."The radius is \{Circles.getRadius()}");
        System.out.println(STR."The Area is \{Circles.getPerimeter()}");
        System.out.println(STR."The date is \{super.setCreatedDate()}"); // using super to reference a method from a superclass


        RectangleFromSimpleGeometry rectangle = new RectangleFromSimpleGeometry();
        System.out.println(STR."\n Rectangle is\{rectangle.toString()}");
        System.out.println(STR."\n Rectangle is \{rectangle.setColor("purple")}");
        System.out.println(STR."\n Rectangle is \{rectangle.isFilled()}");


    }
}