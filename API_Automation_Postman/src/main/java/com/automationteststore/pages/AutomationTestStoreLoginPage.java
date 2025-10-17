package com.automationteststore.pages;

import com.automationteststore.common.BasicCommands;
import com.automationteststore.utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationTestStoreLoginPage extends BasicCommands {

    AutomationTestStoreHomePage homePage = new AutomationTestStoreHomePage();

    private String id_loginName = "loginFrm_loginname";
    private String id_loginPassword = "loginFrm_password";
    private String xpath_loginButton = "//button[@title='Login']";


    public WebElement getLoginName() {

        return getWebDriver().findElement(By.id(id_loginName));

    }

    public WebElement getLoginPassword() {

        return getWebDriver().findElement(By.id(id_loginPassword));

    }

    public WebElement getLoginButton() {

        return getWebDriver().findElement(By.xpath(xpath_loginButton));

    }
    public void validateLogin(String username, String password) throws InterruptedException {

        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(homePage.getLoginLink());
        Thread.sleep(Util.WAIT_5000_MILLISEC);
        type(getLoginName(),username);
        type(getLoginPassword(),password);
        click(getLoginButton());

    }
}
