package week17_Abstraction_Interface_Polymorphism;

public class TestEdible {
    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        Edible.staticMethod();

        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Edible){
                System.out.println(((Edible) objects[i]).howToEat());
               ((Edible) objects[i]).someMethod();
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
        }

    }
}

interface Edible{
    public abstract String howToEat();

    default void someMethod(){      // belongs to the instance of this Interface
        System.out.println("I am from Interface");
    }

    static void staticMethod(){     // belongs to Interface itself
        System.out.println("I am from static Method from Interface");
    }
}

abstract class Animal{
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Chicken : Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal{
    @Override
    public String sound() {
        return "Tiger : Roars";
    }
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Apple: make apple cider";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Orange: make juice";
    }
}



