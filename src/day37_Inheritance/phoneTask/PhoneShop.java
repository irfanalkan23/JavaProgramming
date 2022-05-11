package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(7893322);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-----------------------");

        samsung.call(911);
        samsung.text(23445546);
        samsung.freeze();

        nokia.call(55555555);
        nokia.text(33333333);
        nokia.selfDefense();

        System.out.println("----------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);


    }
}
