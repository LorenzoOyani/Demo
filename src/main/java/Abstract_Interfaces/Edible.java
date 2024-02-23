package Abstract_Interfaces;

/**
 * An interface is a reference type, similar to a class that contains method signatures, default methods
 * constants, nested types and static methods, INTERFACES can only be implemented in a class or extended by other interfaces *  cannot be
 * Defining an interface is similar defining a class.
 * an interface define common behaviour for classes.
 * Abstract classes cannot be used to create object,  contains abstract methods that can be implemented in concrete of the subclasses.
 * An Abstract class is similar to a regular class but cannot be instantiated with the 'new' keyword.
 * A class must be defined as an abstract class if it contains abstract methods
 * The constructors in abstract classes is labelled as protected because it is mostly use by subclass
 * an abstract method is created without implementation in the superclass, but implemented on its subclass.
 * The constructor in an abstract class is declared as protected, because it can only be used in the subclass.
 * Abstract subclass that is extended from an abstract superclass must be made an abstract class if all the methods are not executed properly.
 * All abstract class methods must all be implemented.
 * An abstract class can also be defined without abstract methods, the only trade-offs is that it can be used as a base class for other subclass
 * Abstract classes can be used as type.
 *
 * An interface is a class-like construct that contains only CONSTANT and abstract methods
 * in many ways an interface is like an Abstract class in Java but interface is different in a way that it is used to specify common behaviour of objects
 *
 * comparable, cloneable (all interfaces).
 * an interface is treated like a special class in Java.
 * Same as in Abstract classes, you cannot create from or instantiate an interface in Java, but can be used as type
 *
 * A strong is-a relationship between parent and child can be represented or modelled by a class
 * A weak-is-a-relationship also known as a is-a-kind-relationship can be modelled using interfaces.
 * A interface is treated like a special class in Java, the code is compiled into a separate byte code.
 * and Yeah... OOP is fun, phew phew phew!!!.
  * */


public interface Edible {
    public abstract String howToEat();
}

