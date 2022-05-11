package week11;

import java.util.ArrayList;

public class TestTV {

    public static void main(String[] args) {

        TV Samsung = new TV(); // new keyword invokes our constructor with no parameters

        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(2);
        System.out.println(Samsung);

        TV LG = new TV();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);

        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);


        // ArrayList
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);

        for (TV eachTV : tvList) {
            System.out.println("Is the TV on ? " + eachTV.on);
        }


    }




}
