package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaInput {

    private static final String INPUT_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::textarea";

    private String labelTextArea;
    private WebDriver driver;

    public TextAreaInput(WebDriver driver, String labelTextArea) {
        this.labelTextArea = labelTextArea;
        this.driver = driver;
    }

    public void inputTextArea(String text) {
        String finalXpath = String.format(INPUT_XPATH, labelTextArea);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);
    }
}
