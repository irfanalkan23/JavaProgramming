package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;        // static & final by default
    static int b = 200; // final by default

    // you can not have constructor in interface ! because you can not create object from interface
//    public PropertiesOfInterface(int a) {
//        this.a = a;
//    }

    // an interface can not have a static class ! Why?
    // static bloc executes when a class is run, but interface is not a class
//    static {
//        b = 100;
//    }

    // interface can not have instance methods !
    // object can not be created from interface
    // interface is not a class, no class = no objects, no objects = no instances
//    public void method1() {
//        System.out.println("Instance method");
//    }

    public static void method2() {
        System.out.println("Static method");
    }

    public abstract void method3();

    public default void method4() {             // ex. drink()
        System.out.println("Default method");
    }


}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        new Test().method4();           // now method4() is treated as an instance method
    }
}