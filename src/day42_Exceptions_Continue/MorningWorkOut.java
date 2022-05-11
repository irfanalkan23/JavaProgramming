package day42_Exceptions_Continue;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------------Push up started-----------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i); // carriage return

                sleep(0.3);
        }

        System.out.println("\n--------------Push ups completed-----------------");

        System.out.println("--------------Pull up started-----------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull up " + i); // carriage return

            sleep(0.3);
        }

        System.out.println("\n--------------Pull ups completed-----------------");

    }

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
