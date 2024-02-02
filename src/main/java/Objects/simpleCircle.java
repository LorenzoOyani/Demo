package Objects;

public class simpleCircle {

    public static void main(String[] args) {
        simpleCircle circle1 = new simpleCircle();
        /**
         *  % specifies a line break in java printf function.
         * */
        System.out.printf("The radius of the is %.2d %.2d " + circle1.radius + " is " + circle1.getArea());
    }

    double radius;

    simpleCircle() {
        radius = 20;
    }

    simpleCircle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }

}
