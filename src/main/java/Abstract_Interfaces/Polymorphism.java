package Abstract_Interfaces;

import Abstract_Interfaces.CircleFromSimpleGeometryCircle;
import Abstract_Interfaces.RectangleFromSimpleGeometry;
import CircleObjects.SimpleGeometryCircle;

public class Polymorphism {
    void main(){
        GeometricObjects getGeometric1 = new CircleFromSimpleGeometryCircle(67.43);
        GeometricObjects getGeometric2 = new RectangleFromSimpleGeometry();

//        GeometricObjects[] obj = new GeometricObjects[10];
//        for(int  i = 0; i < obj.length; i++){
//            GeometricObjects e = obj;
//        }

        System.out.println(STR."is the object equal? \{equalObjects(getGeometric1, getGeometric2)}");
        displayObjects(getGeometric1);
        displayObjects(getGeometric2);
    }
    public Boolean equalObjects(GeometricObjects geo1, GeometricObjects geo2){
        return geo1.getArea() == geo2.getArea();
    }

    public void displayObjects(GeometricObjects object){
        System.out.println("");
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());



    }


}