package week17_Abstraction_Interface_Polymorphism.interface_demo;

public interface WebDriver {
    void get(String url);  // it is automatically public abstract
    void findElement(String locator);
    void quit();
    String getTitle();


}
