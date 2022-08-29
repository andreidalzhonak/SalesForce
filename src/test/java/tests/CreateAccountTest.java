package tests;


import io.qameta.allure.*;
import io.qameta.allure.Description;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.PageLogin;
import testdata.PrepareNewAccountData;

@Epic("User Managment")
@Feature("Registration")
@Story("Create account")
public class CreateAccountTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test(priority = 1)
    @Description("Create new user")
    @Issue("Qa-100")
    @TmsLink("SalesForce-1")
    @Severity(SeverityLevel.BLOCKER)
    public void createAccountPageTest() {
        PageLogin pageLogin = new PageLogin(driver);
        LOGGER.info(String.format("Page %s initialized", PageLogin.class.getName()));
        LOGGER.info(String.format("Open page" + PageLogin.class.getName()));
        LOGGER.info("Input username and Password");
        LOGGER.info("Click Button");
        pageLogin.loginToSalesForce();
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Data %s is prepared ", PrepareNewAccountData.class.getName()));
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        LOGGER.info(String.format("Open %s page", AccountsPage.class.getName()));
        accountsPage.openAccountsPage();
        LOGGER.info(String.format("Open %s page", NewAccountModel.class.getName()));
        LOGGER.info("Input test data");
        accountsPage.openNewAccountModal().fillInAccountForm(accountModel);
        LOGGER.info("Check what account matches with account name");
        Assert.assertEquals(accountModel.getAnnualRevenue(), accountsPage.takeName());

    }
}
