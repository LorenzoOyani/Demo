package Abstract_Interfaces;

import Abstract_Interfaces.GeometricObjects;

public class RectangleFromSimpleGeometry extends GeometricObjects {
    private  double height;
    private double weight;
    RectangleFromSimpleGeometry(){};

    RectangleFromSimpleGeometry(double height, double weight){
        this.height = height;
        this.weight =weight;
    }

    RectangleFromSimpleGeometry(double height, double weight, String color, boolean filled, int radius){
        super(color,filled,radius);
        this.height = height;
        this.weight = weight;
        setColor(color);
        setFilled(filled);
        setRadius(radius);
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return  weight;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return weight * height;
    }
    public double getPerimeter(){
        return  2 * (weight + height);
    }

}

