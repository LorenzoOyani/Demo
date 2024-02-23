package Abstract_Interfaces;

import java.util.Date;

/**
 * Interface consist of abstract methods and constants.
 * You implement an interface.
 * */
public class TestEdible implements Edible{
    void main() {
        Object[] objects = {new Tiger(), new Snake()};
        for (int i = 0; i < objects.length; i++) {
            //check if the objects in the array are instances of Edible. then implement the interface methods
            if (objects[i] instanceof Edible) {
                System.out.println((((Edible) objects[i]).howToEat()));
//                System.out.println((((Edible) objects[i]).howToEat()));

            }
            if(objects[i] instanceof Animal){
                System.out.println(((((Animal) objects[i]).MakeSound())));
            }
        }
    }

    @Override
    public String howToEat() {
        return null;
    }

    abstract class Animal {

        abstract String MakeSound();
    }

    class Tiger extends Animal implements Edible{
        @Override
        public String howToEat(){
            return "Tiger, Roast it";
        }

        @Override
        String MakeSound() {
            return "ROAR!!!!";
        }
    }

    class Snake extends Animal implements Edible{
        @Override
        public String howToEat(){
            return "do not eat this beast!";
        }
        @Override
        public String MakeSound(){
            return "Hiss!" ;
        }
    }



}
    

