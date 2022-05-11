package day44_Abstraction.animalTask;

public interface Playable {

    static final boolean isFriendly = true; // static & final by default

    /*
    public static void method1();
        System.out.println(isFriendly);     // this is how we can prove if the isFriendly variable is static
     */

    public abstract void play();        // public & abstract by default


}
