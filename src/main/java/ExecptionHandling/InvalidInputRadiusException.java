package ExecptionHandling;

public class InvalidInputRadiusException extends Exception {
    private double radius;
    public void setRadius(double radius) {

        this.radius = radius;
    }

}