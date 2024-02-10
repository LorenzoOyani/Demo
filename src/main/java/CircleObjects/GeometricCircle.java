package CircleObjects;

import java.util.Date;

public class GeometricCircle {
    private String color = "red";
    private boolean filled = false;

    Date date;

    GeometricCircle(){
        this("red", false);
    }
    GeometricCircle(String color, boolean filled){
        date = new Date();
        this.color = color;
        this.filled = filled;

    }

    public Date getDate(){
        return date;
    }
    public Date setCreatedDate() {
        return  new Date();
    }
    public String setColor(String color) {
        return this.color = color;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public boolean setIsFilled(boolean fill) {
        return  this.filled = fill;
    }

}