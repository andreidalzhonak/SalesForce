package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.BaseTest;

public class AccountsPage extends BasePage {
    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;

    @FindBy(xpath = "//div[contains(@class, 'slds-grid slds-size_1-of-1 label-stacked')]//span[text()='Account Name']//ancestor::div[contains(@class, 'slds-form-element_stacked')]//div[2]//lightning-formatted-text")
    private WebElement nameAccount;
    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    public  NewAccountModalPage openNewAccountModal() {
        newButton.click();
        return new NewAccountModalPage (driver);
    }
public String takeName() {
        String accountName = nameAccount.getText();
    return accountName;
}
}
