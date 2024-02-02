package CircleObjects;

public class CircleFromSimpleGeometryCircle extends SimpleGeometryCircle {
    double radius;

//    CircleFromSimpleGeometryCircle(){}
    CircleFromSimpleGeometryCircle(double radius) {
        this.radius = radius;
    }

    CircleFromSimpleGeometryCircle(String color, boolean filled, int radius) {
        super(color, filled, radius);
//        this.radius = radius;
        setColor(color);
        setFilled(filled);
        setRadius(radius);

    }
    CircleFromSimpleGeometryCircle(){
        this(4);
    }

@Override
    public int getRadius() {
        return (int) radius;
    }

//    public double setRadius(double radius) {
//        return this.radius = radius;
//    }
    public  double getArea(){
        return  radius * radius* Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}