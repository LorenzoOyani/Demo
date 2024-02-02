package CircleObjects;

public class Polymorphism {
    Object radius;
    void main() {
        Object object1 = new CircleFromSimpleGeometryCircle(20);
        Object object2 = new RectangleFromSimpleGeometry();
        displayObjects(object1);
        displayObjects(object2);
        Object obj = new RectangleFromSimpleGeometry();
        equals(obj);
    }

    void displayObjects(Object objects) {
        if (objects instanceof CircleFromSimpleGeometryCircle) {
            // object casting defining an explicit cast
            System.out.println(STR."Area of a circle is \{((CircleFromSimpleGeometryCircle) objects).getPerimeter()}"); // polymorphic call
            System.out.println(STR."Area of a circle is \{((CircleFromSimpleGeometryCircle) objects).getArea()}"); // polymorphic call
        }
        else if(objects instanceof RectangleFromSimpleGeometry){
            System.out.println(STR."The rect is \{((RectangleFromSimpleGeometry) objects).getPerimeter()}");
            System.out.println("The rect is "+ ((RectangleFromSimpleGeometry)objects).getArea());

        }


    }
    @Override
    public boolean equals(Object x){
        if(x instanceof RectangleFromSimpleGeometry){
            return (boolean) (this. radius= ((RectangleFromSimpleGeometry)x).getRadius());
        } else{
            return this == x;
        }
    }

    public void newObj(){
        Object obj = new SimpleGeometryCircle();
        Object obj1 = new CircleFromSimpleGeometryCircle();
        System.out.println(obj.equals(obj1));
    }
}