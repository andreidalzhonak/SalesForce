package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageLogin extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(PageLogin.class.getName());

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public PageLogin(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesForce() {
        LOGGER.debug(String.format("Attempt to open URL: %s", Urls.SALES_FORCE_LOGIN));
        driver.get(Urls.SALES_FORCE_LOGIN);
        LOGGER.debug(String.format("Input username %s", Credentials.USERNAME));
        usernameInput.sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Input password %s", Credentials.PASSWORD));
        passwordInput.sendKeys(Credentials.PASSWORD);
        LOGGER.info("Click Log In");
        loginButton.click();
    }
}
