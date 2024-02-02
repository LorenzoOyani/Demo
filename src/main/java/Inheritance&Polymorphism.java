import java.io.IOException;

/**
 * The three fundamentals of OOP are Encapsulation, Inheritance, and polymorphism
 * Defining a new class from existing class is called inheritance
 * Java does not support multiple inheritance.
 * but multiple inheritance can be made possible with the help of interfaces
 * inheritance is used to model the is-a relationship
 * The 'super' keyword is related to the superclass, it is used to invoke methods and data fields of the superclass
 * The super class must be called first on the constructor before anything else
 * An instance method can be overriding only if it is accessible, thus, a private method cannot be overriding because it is not accessible out its own class
 * To overload a method, the method must be defined but with different signature, but an override will have to be possible with the same signatures
 * e.g: class A
 * overriding methods are in different classes related by inheritance.
 * overloaded methods can be in the same class or different class relative to each other by inheritance.
 * overriding methods have same name and same signature type
 * overloaded methods have same signature type and different parameter list.
 * <p>
 * POLYMORPHISM
 * //subType and superType
 * A class defines by a subclass is called a subtype, while a class defines by superclass is called a supertype
 * polymorphism means many forms
 * <p>
 * An object of a subclass can be used wherever its superclass is used.
 * in polymorphism, a variable of a supertype can refer to a subtype
 * Dynamic binding is when the Object tree is searched starting from the lowest subclass till the general superclass
 * Casting of objects and instanceof operator;
 * The Object equals method
 */

class Test {
    void main() {
        A a = new A();
        B b = new B();
        a.point(10);
        a.point(10.0);
        b.points(20);
        b.points(32.5);


    }
}

class A {
    public void point(double i) {
        System.out.println(3 * i + "");
//        return i* 2;
    }
}

class B extends A {
    @Override
    public void point(double i) {
        System.out.println(5 * i + "");
//        return 3* i;
    }

    public void points(double i) {
        System.out.println(i * 40.50);
    }

    public void points(int i) {
        System.out.println(i * 50);
    }
}
/* example of method overrides and method overloading */

class circle extends IOException {

    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    circle() {
        this(30);
    }

    //    circle(){}
    void main() {
        C c = new C((long) 90000.000);
        System.out.println(STR."The area of class circle is \{(c.getArea())} ");
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double rad) {
        return this.radius = rad;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


}

class C extends circle {

    private long length;

    //    C(){}
    C(double radius, long length) {
        super(radius);
        this.length = length;


    }
//    C(){this(24.3);}

    public C(long length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return super.getArea() * length;
    }
}



class Testes {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
//    @Override
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
}

class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}

class Person {
    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}

/**
 * Implicit casting
 */