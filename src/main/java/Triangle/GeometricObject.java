package Triangle;

import java.util.Date;

public class GeometricObject {
    private String color = "Black";
    private boolean filled;
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }
    GeometricObject(){}

    GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor " + color + "filled " + filled;
    }
}