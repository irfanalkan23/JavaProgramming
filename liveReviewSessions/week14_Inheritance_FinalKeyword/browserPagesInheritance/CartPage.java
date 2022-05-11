package week14_Inheritance_FinalKeyword.browserPagesInheritance;

public class CartPage extends AmazonHomePage {

    public String buyerInfo;

    public CartPage(String name, String buyerInfo) {
        super(name);
        this.buyerInfo = buyerInfo;
    }

    public void fillInfo() {
        System.out.println("Filling the necassary fields with : " + buyerInfo);
    }

    public void payFor(long cardNumber) {
        System.out.println("Paying with credit card : " + cardNumber);
    }
}
