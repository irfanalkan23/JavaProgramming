package week14_Inheritance_FinalKeyword.browserPagesInheritance;

public class TestCase {

    public static void main(String[] args) {

        // If I want to use fields and methods of Browser Class:
        // do I have to create an object from the Browser class
        // Can I also reach with child class object?

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating : "+ amazonHomePage.getName());
        System.out.println("My operating system is : " + Browser.getOSName());  // use class name for static field

        amazonHomePage.navigateTo("www.amazon.com");
        amazonHomePage.navigateTo("Search for laptops");
        amazonHomePage.shopFor("Samsung PC");

        // Can I use amazonHomePage object to reach ProductPage shopFor method? no,
        // parent can not reach subclass method
        ProductPage productObject = new ProductPage("Chrome", 2);
        String product = amazonHomePage.product;
        productObject.shopFor(product);  // you can use also like; amazonHomePage.product

        // navigate to Cart: I can use both objects
        // productObject.navigateTo("Cart"); we can use as well child class object

        amazonHomePage.navigateTo("Cart");

        CartPage cartPage = new CartPage("Chrome", "Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(2333222255553333L);

        cartPage.setName("Firefox");

        cartPage.closeBrowser();

        cartPage.setName("Firefox");
        System.out.println("I am automating : " + cartPage.getName());
        System.out.println("I am automating : "+ amazonHomePage.getName());

    }
}
/*
1. I need to set my browser and OS type
2. Navigate to App's Page
3. navigate to laptops and select Samsung PC
4. Go to product's page, buy 2 of them, add to card
5. Go to cart, fill all the fields and order
6. Check the amount and prices are as expected
 */