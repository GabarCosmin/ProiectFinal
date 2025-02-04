import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon;

    public void clickLoginIcon() {
        loginIcon.click();
    }

    @FindBy(id = "user-name")
    private WebElement username;

    public void setUsername() {
        username.sendKeys("Dino");
    }

    @FindBy(id = "password")
    private WebElement password;

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginIcon.click();
    }

    @FindBy(linkText = "dino")
    private WebElement correctName;

    public WebElement getCorrectName() {
        return correctName;
    }

    @FindBy(css = ".error")
    private WebElement loginError;

    public WebElement getLoginError() {
        return loginError;
    }
}

