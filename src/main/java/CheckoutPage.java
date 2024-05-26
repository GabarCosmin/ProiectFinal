import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(className = "product-image")
    private WebElement productImage;

    public WebElement getProductImage() {
        return productImage;
    }

    @FindBy(linkText = "Awesome Granite Chips")
    private WebElement addProductGraniteChipsToCartLink;

    public void clickAddProductGraniteChipsToCartLink() {
        addProductGraniteChipsToCartLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addProductGraniteChipsToCartButton;

    public void clickAddProductGraniteChipsToCartButton() {
        addProductGraniteChipsToCartButton.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement cartButton;

    public void clickCartButton() {
        cartButton.click();
    }

    @FindBy(css = "sort-products-select")
    private WebElement sortButton;

    public void clickSortButton() {
        sortButton.click();
    }

    @FindBy(css = "shopping-cart-icon fa-layers fa-fw")
    private WebElement cartIcon;

    public void clickCartIconButton() {
        cartIcon.click();
    }

    @FindBy(css = "card-img")
    private WebElement getShoppingCartBacon;

    public void clickShoppingCart() {
        getShoppingCartBacon.click();
    }

    @FindBy(css = "container")
    private WebElement getContainerLogo;

    public void clickContainerLogo() {
        getContainerLogo.click();
    }

    @FindBy(css = "btn-link")
    private WebElement clickButtonMinus;

    public void clickButtonMinus() {
        clickButtonMinus.click();
    }


    @FindBy (xpath = "//td[@class='amount'])[1]")
    private WebElement itemPrice;

    @FindBy (xpath = "//td[@class='amount'])[2]")
    private WebElement taxPrice;

    @FindBy (xpath = "//td[@class='amount'])[3]")
    private WebElement totalPrice;

    public double productPrice() {
        String amountValue = itemPrice.getText(); //$15.99
        String cleanAmountValue = amountValue.replace("$", "");
        return Double.parseDouble(cleanAmountValue);
    }

    public double taxPrice() {
        String taxValue = taxPrice.getText(); //$15.99
        String cleanTaxValue = taxValue.replace("$", "");
        return Double.parseDouble(cleanTaxValue);
    }

    public double totalPrice() {
        String totalValue = totalPrice.getText(); //$15.99
        String cleanTotalValue = totalValue.replace("$", "");
        return Double.parseDouble(cleanTotalValue);
    }
    @FindBy(css = ".svg-inline--fa fa-plus-circle.fa-w-16")
    private WebElement plusQuantity;

    public void clickPlusQuantity() {
        plusQuantity.click();
    }


    @FindBy(id = "item_1_title_link")
    private WebElement graniteChipsProduct;

    public WebElement getGraniteChipsProduct() {
        return graniteChipsProduct;
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement checkOutButton;

    public WebElement getCheckOutButton() {
        return checkOutButton;
    }

    @FindBy(css = "svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement buttonProduct;

    public WebElement getButtonProduct() {
        return getButtonProduct();


        }
    }
