package pages;

import elements.DropDownList;
import elements.TextAreaInput;
import elements.TextInput;
import models.NewAccountModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement accountNameInput;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']")
    private WebElement saveButton;


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        accountNameInput.sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new DropDownList(driver, "Type").selectOptionInList(newAccount.getType());
        new DropDownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextAreaInput(driver, "Description").inputTextArea(newAccount.getDescription());
        new TextAreaInput(driver, "Billing Street").inputTextArea(newAccount.getBillingStreet());
        new TextAreaInput(driver, "Shipping Street").inputTextArea(newAccount.getShippingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipPostalCode());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingStateProvince());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipPostalCode());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());



        //ToDo: add all details

        saveButton.click();

    }
}
