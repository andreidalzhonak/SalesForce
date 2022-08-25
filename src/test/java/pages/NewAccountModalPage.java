package pages;

import elements.DropDownList;
import elements.TextAreaInput;
import elements.TextInput;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(NewAccountModalPage.class.getName());
    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement accountNameInput;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']")
    private WebElement saveButton;


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        LOGGER.debug(String.format("Input accountName %s", newAccount.getAccountName()));
        accountNameInput.sendKeys(newAccount.getAccountName());
        LOGGER.debug(String.format("Input Phone %s", newAccount.getPhone()));
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        LOGGER.debug(String.format("Input Fax %s", newAccount.getFax()));
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        LOGGER.debug(String.format("Input Website %s", newAccount.getWebsite()));
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        LOGGER.debug(String.format("Input Employees %s", newAccount.getEmployees()));
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        LOGGER.debug(String.format("Input AnnualRevenue %s", newAccount.getAnnualRevenue()));
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        LOGGER.debug(String.format("Select Type %s", newAccount.getType()));
        new DropDownList(driver, "Type").selectOptionInList(newAccount.getType());
        LOGGER.debug(String.format("Select Industry %s", newAccount.getIndustry()));
        new DropDownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        LOGGER.debug(String.format("Input Description %s", newAccount.getDescription()));
        new TextAreaInput(driver, "Description").inputTextArea(newAccount.getDescription());
        LOGGER.debug(String.format("Input BillingStreet %s", newAccount.getBillingStreet()));
        new TextAreaInput(driver, "Billing Street").inputTextArea(newAccount.getBillingStreet());
        LOGGER.debug(String.format("Input ShippingStreet %s", newAccount.getShippingStreet()));
        new TextAreaInput(driver, "Shipping Street").inputTextArea(newAccount.getShippingStreet());
        LOGGER.debug(String.format("Input BillingCity %s", newAccount.getBillingCity()));
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        LOGGER.debug(String.format("Input BillingStateProvince %s", newAccount.getBillingStateProvince()));
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        LOGGER.debug(String.format("Input BillingZipPostalCode %s", newAccount.getBillingZipPostalCode()));
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipPostalCode());
        LOGGER.debug(String.format("Input BillingCountry %s", newAccount.getBillingCountry()));
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        LOGGER.debug(String.format("Input ShippingCity %s", newAccount.getShippingCity()));
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        LOGGER.debug(String.format("Input Shipping State/Province %s", newAccount.getShippingStateProvince()));
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingStateProvince());
        LOGGER.debug(String.format("Input Shipping Zip/Postal Code %s", newAccount.getShippingZipPostalCode()));
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipPostalCode());
        LOGGER.debug(String.format("Input Shipping Country %s", newAccount.getShippingCountry()));
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());


        //ToDo: add all details
        LOGGER.info("Click Save button");
        saveButton.click();

    }
}
