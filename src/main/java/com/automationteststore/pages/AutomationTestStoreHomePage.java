package com.automationteststore.pages;

import com.automationteststore.common.BasicCommands;
import com.automationteststore.utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationTestStoreHomePage extends BasicCommands {

    private String lnk_login = "Login or register";
    private String id_search = "filter_keyword";
    private String xpath_go = "//div[@title='Go']";
    private String xpath_eyeMasterItem = "//a[text()='Eye master']";
    private String xpath_addToCartBtn = "//a[@class='cart']";
    private String id_checkout = "cart_checkout1";
    private String xpath_checkoutLink = "(//span[text()='Checkout'])[1]";
    private String xpath_continueBtn = "//a[@title='Continue']";

    public WebElement getLoginLink() {

        return getWebDriver().findElement(By.linkText(lnk_login));

    }

    public WebElement getSearchField() {

        return getWebDriver().findElement(By.id(id_search));

    }

    public WebElement getGoIcon() {

        return getWebDriver().findElement(By.xpath(xpath_go));

    }

    public WebElement getEyeMasterItem() {

        return getWebDriver().findElement(By.xpath(xpath_eyeMasterItem));

    }

    public WebElement getAddtoCartBtn() {

        return getWebDriver().findElement(By.xpath(xpath_addToCartBtn));

    }

    public WebElement getCheckoutBtn() {

        return getWebDriver().findElement(By.id(id_checkout));

    }

    public WebElement getCheckoutLink() {

        return getWebDriver().findElement(By.xpath(xpath_checkoutLink));

    }

    public WebElement getContinueBtn() {

        return getWebDriver().findElement(By.xpath(xpath_continueBtn));

    }

    public void validateProductSearchAndAddToCart () throws InterruptedException {

        Thread.sleep(Util.WAIT_5000_MILLISEC);
        type(getSearchField(), "Eye Master");
        click(getGoIcon());
        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(getEyeMasterItem());
        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(getAddtoCartBtn());

    }

    public void validateSingleProductCheckout () throws InterruptedException {

        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(getCheckoutBtn());

    }

    public void validateEmptyCartCheckout () throws InterruptedException {

        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(getCheckoutLink());
        Thread.sleep(Util.WAIT_5000_MILLISEC);
        click(getContinueBtn());

    }


}
