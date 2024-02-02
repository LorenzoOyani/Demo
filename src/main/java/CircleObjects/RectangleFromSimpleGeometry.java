package CircleObjects;

public class RectangleFromSimpleGeometry extends SimpleGeometryCircle {
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

class Apple extends Fruit {
    private String name;

    private int appleBees;

    public void main(String[] args) {
        Fruit fr = new Fruit("banana", 46);
        System.out.println(STR."New name is \{super.setName("Lawrence")}");
        System.out.print(STR."and I like \{fr.getName()} and \{fr.getNumber()}");
        System.out.println(STR." number of apple bees is to play with is  \{this.setAppleBees(23)} and the number of fruits is \{super.getNumber()} and the new number of fruits is \{super.setNumber(89)}");
    }

    Apple(String name,int number ,int appleBees) {
        super(name, number);
//        this.appleBees = appleBees;
        setName(name);
        setNumber(number);

    }

    Apple(int appleBees) {
        this.appleBees = appleBees;
    }

    Apple() {
        this(3);
    }

    public int setAppleBees(int newAppleBees) {
        return this.appleBees = newAppleBees;
    }

    @Override
    public String setName(String newName) {
        return this.name = (newName);


    }
}

class Fruit {
    private  String name;
    private int number;
//    Fruit(){}
    Fruit(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("A non-arg constructor is called");
    }
    Fruit(){
        this("John", 13);
    }
    public String getName(){
        return name;
    }
    public  String setName(String name){
        return this.name = name;
    }
    public int setNumber(int newNumber) {
        return this.number = newNumber;
    }
    public int getNumber(){
        return number;
    }

}