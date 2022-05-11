package week16;

public class AtTheGym {

    public static void main(String[] args) {

//        Exercise exercise = new Exercise();   // can not be instantiated

        Running running = new Running(90);
        Swimming swimming = new Swimming(90);
        FreeWeight freeWeight = new FreeWeight(90);

        // polymorphise
//        Exercise polyObject = new Running();  //next week topic

        running.start();
        running.perform();
        System.out.println("Running for 30 minutes: " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming for 30 minutes: "+ swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight exercise for 30 minuntes: " + freeWeight.getCaloriesCount(30));
    }
}
