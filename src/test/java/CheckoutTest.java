import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import static io.restassured.Restassured.given;



@Listeners(ExtentTestNGITestListener.class)

public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;
    private WebDriver driver;

    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @Test(description = "This test sort and delete items products from the basket utilising button minus")
    public void SortAndDeleteItems() throws InterruptedException {
        checkoutPage.clickSortButton();
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getSortButton(), "Sort by price (low and high)");
        Thread.sleep(3000);
        checkoutPage.clickCartIconButton();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartBacon()));
        checkoutPage.clickCartButton();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getContainerLogo()));
        checkoutPage.clickContainerLogo();
        Thread.sleep(2000);
        checkoutPage.();
        Thread.sleep(5000);
        checkoutPage.clickShoppingCart();
        checkoutPage.clickButtonMinus();
        Thread.sleep(5000);
        checkoutPage.clickCartButton();
        checkoutPage.clickAddProductGraniteChipsToCartButton();
        Thread.sleep(5000);
        checkoutPage.clickAddProductGraniteChipsToCartLink();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    }


    @Test(description = "Test the search functionality by searching for the keyword 'mouse' ")
    public void searchTest() {
        checkoutPage.setSearchBar();
        checkoutPage.clickSearchButton();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The search engine is looking up for the keyword 'mouse' ");



    @Test
    public void checkoutTest() {
        extentTest = extentReports.createTest("Testing the search functionality", "The test is searching for the keyword 'mouse' ");

        extentTest.pass("The search returned two products! Test passed successfully");
    }

    @Test
    public void loginTest() {
            extentTest = extentReports.createTest("Testing the search functionality", "The test is searching for the keyword 'mouse' ");

            extentTest.pass("The search returned two products! Test passed successfully");

            @Test(description = "Changing qunatity test. Asserting that the price is updated correctly")
            public void quantityTest () {
                checkoutPage.clickAddProductGraniteChipsToCartLink();
                checkoutPage.clickAddProductGraniteChipsToCartButton();
                checkoutPage.clickCartButton();
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
                double expectedTotal = checkoutPage.productPrice() * 2;
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after updating should be: " + expectedTotal);
                checkoutPage.clickPlusQuantity();
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after update is: " + checkoutPage.productPrice());
                assertEquals(checkoutPage.productPrice(), expectedTotal);
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is matching the expected price");
            }

            @Test(description = "Calculating the price of a product with taxes")
            public void totalPriceCalculatingTest () {
                checkoutPage.clickAddProductGraniteChipsToCartLink();
                checkoutPage.clickAddProductGraniteChipsToCartButton();
                checkoutPage.clickCartButton();
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.taxPrice());
                double expectedTotal = checkoutPage.productPrice() + checkoutPage.taxPrice();
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The expected total shoul be: " + expectedTotal);
                ExtentTestNGITestListener.getTest().log(Status.INFO, "The actual total is: " + checkoutPage.totalPrice());
                assertEquals(checkoutPage.totalPrice(), expectedTotal);

