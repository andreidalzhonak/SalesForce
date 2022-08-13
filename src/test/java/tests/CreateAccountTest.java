package tests;

import models.NewAccountModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.PageLogin;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createAccountPageTest() {
        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.loginToSalesForce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);
        Assert.assertEquals(accountModel.getAccountName(), accountsPage.takeName());

    }
}
