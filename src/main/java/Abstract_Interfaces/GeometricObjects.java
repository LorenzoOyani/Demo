package Abstract_Interfaces;

import java.util.Date;

public abstract class GeometricObjects {
    private Date datecreated;
    private String color = "white";
    private double radius = 56.89;
    private boolean filled;


    protected GeometricObjects(String color, double radius, boolean filled, Date datecreated) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
        this.datecreated = datecreated;
    }

    public GeometricObjects(String color, boolean filled, int radius) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    protected GeometricObjects() {
    }


    public Date getDateCreated() {
        return datecreated;
    }

    public void setDateCreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    protected Date setCreatedDate() {
        return this.datecreated;

    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}