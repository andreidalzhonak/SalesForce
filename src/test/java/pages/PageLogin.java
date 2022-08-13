package pages;
import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin extends BasePage {

        @FindBy(id = "username")
        private WebElement usernameInput;

        @FindBy(id = "password")
        private WebElement passwordInput;

        @FindBy (id = "Login")
        private WebElement loginButton;

    public PageLogin(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesForce() {
        driver.get(Urls.SALES_FORCE_LOGIN);
        usernameInput.sendKeys(Credentials.USERNAME);
        passwordInput.sendKeys(Credentials.PASSWORD);
        loginButton.click();
        }
}
