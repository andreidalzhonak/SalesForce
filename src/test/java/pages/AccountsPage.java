package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());
    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;

    @FindBy(xpath = "//div[contains(@class, 'slds-grid slds-size_1-of-1 label-stacked')]//span[text()='Account Name']//ancestor::div[contains(@class, 'slds-form-element_stacked')]//div[2]//lightning-formatted-text")
    private WebElement nameAccount;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open account Url")
    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }


    @Step("Create New Modal Page")
    public NewAccountModalPage openNewAccountModal() {
        LOGGER.info("Click New button");
        newButton.click();
        return new NewAccountModalPage(driver);
    }


    @Step("Check account Name")
    public String takeName() {
        LOGGER.debug(String.format("Check account name %s", nameAccount.getText()));
        String accountName = nameAccount.getText();
        return accountName;
    }
}
