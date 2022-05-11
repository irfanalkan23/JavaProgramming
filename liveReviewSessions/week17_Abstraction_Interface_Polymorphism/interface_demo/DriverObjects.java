package week17_Abstraction_Interface_Polymorphism.interface_demo;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        // polymorphism

        WebDriver driver3 = new ChromeDriver();
        // driver3 which is a variable of WebDriver (supertype) is referring to a subtype(chromeDriver) object


        driver1.get("www.google.com");
        driver1.findElement("//input[@name='q']");

        System.out.println("Title : "+driver1.getTitle());


        driver3.get("www.cydeo.com");

//        driver3.someUniqueMethod();       // compile error. driver3 cannot reach child class method. needs casting
        ((ChromeDriver)driver3).someUniqueMethod();

        driver3 = new FirefoxDriver();

        ((FirefoxDriver)driver3).someUniqueMethodforFirefox();

    }
}
