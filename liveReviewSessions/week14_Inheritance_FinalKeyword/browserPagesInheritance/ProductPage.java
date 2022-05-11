package week14_Inheritance_FinalKeyword.browserPagesInheritance;

public class ProductPage extends AmazonHomePage {

    public int quantity;

    public ProductPage(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    // need: our shopFor method is not specialized enough for this class
    @Override
    public void shopFor(String product) {
        super.product = product;
        System.out.println("Automating " + getName());  // which browser we are automating
        System.out.println("Addding " + quantity + " amount of " + super.product + " to card");
    }




}
