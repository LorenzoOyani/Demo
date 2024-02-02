package CircleObjects;

public class DynamicDemo {
public static void main(String[] args){
//    Person p = new Person();
    DynamicDemo dynamo = new DynamicDemo();
    DynamicDemo.m(new Subject());
    DynamicDemo.m(new Students().getInfo());
    DynamicDemo.m(new Person());
    DynamicDemo.m(new Object());
    DynamicDemo.m(new Person().getInfo());

    Object o =new Students().getInfo();
    DynamicDemo.m(o.toString());
    Object c = new SimpleGeometryCircle().setCreatedDate();
    if(c instanceof SimpleGeometryCircle){
        DynamicDemo.m(c.toString());
    }
    DynamicDemo.m(c.toString());



}
static  void m(Object x){
    System.out.println(x.toString());
}


}
//static  void m(Object x){
//    System.out.println(x.toString());
//}

class Subject extends Students{

}
class Students extends Person{
    @Override
    public String getInfo(){
        return "person";
    }
}
class Person{

    public String getInfo(){
        return "student";
    }
    @Override
    public String toString(){
        return "Person class";
    }
}

/**
 * implicit casting.
 * Explicit casting
 * upcasting
 * down casting
 * */
