package Abstract_Interfaces;

public class CircleFromSimpleGeometryCircle extends GeometricObjects {
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
    public double getRadius() {
        return  radius;
    }
    public  double getArea(){
        return  radius * radius* Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}