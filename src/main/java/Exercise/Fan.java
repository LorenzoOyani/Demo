/**
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * denote the fan speed.
 * ■ A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW).
 * ■ A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * ■ A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * ■ A string data field named color that specifies the color of the fan (the default
 * is blue).
 * ■ The accessor and mutator methods for all four data fields.
 * ■ A no-arg constructor that creates a default fan.
 * ■ A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan speed, color, and radius in one combined
 * string. If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * blue, and turn it off to the second object. Display the objects by invoking their
 * toString method.
 * */

public class Fan {
    private static final int SLOW = 1;
    private static final int  MEDIUM = 2;
    private static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int setSpeed(int newSpeed) {
        return speed = newSpeed;
    }
    public String getSpeed() {
        String s = "";
        switch(speed){
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }

    public void setOn(boolean on) {on = true;}
    public boolean getOn(){
        return  on;
    }
    public double setRadius(double radius) {
        return  this.radius = radius;
    }
    public double getRadius(){return  radius;}

    public String setColor(String color){
        return this.color = color;
    }

    public String getColor(){
        return color;
    }
    public String toString() {
        if(on == true){
            return STR."\nFan speed: \{getSpeed()}, color: \{color}, radius: \{radius}\n";
        }
        else{
            return STR."\nFan color: \{color}, radius: \{radius}\nfan is off\n";
        }
        }
    }



