package CircleObjects;

import java.util.Date;

public class SimpleGeometryCircle {
    private String color = "blue";
    private boolean filled;
    private Date dateCreated;
    private int radius;

    SimpleGeometryCircle(){} // no-arg constructor
    SimpleGeometryCircle(String color, boolean filled, int radius) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public int getRadius(){
        return radius;
    }
    public int setRadius(int newRadius){
        return radius = newRadius;
    }


    public boolean setFilled(boolean filled) {
        return this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date setCreatedDate(){
        return new Date();
    }

    public String toString() {
        return (STR." The object that was created on \n\{setCreatedDate()} the color is \{color} and it is filled.");
    }


}



