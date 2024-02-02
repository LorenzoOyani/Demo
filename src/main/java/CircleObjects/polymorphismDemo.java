package CircleObjects;

//import org.jetbrains.annotations.NotNull;

public class polymorphismDemo {
    void main() {
        /* Two polymorpism class to the object subtype that reference the supertype **/
        displayObject(new CircleFromSimpleGeometryCircle("red", false, 30));
        displayObject(new RectangleFromSimpleGeometry(1, 1, "red", false, 30));
        Object o = new SimpleGeometryCircle();
        System.out.println(o.toString());


    }

    public void displayObject( SimpleGeometryCircle object) {
        System.out.println(STR."Created on \{object.setCreatedDate()}. color is \{object.getColor()}");
    }
}