package com.automationteststore.common;

import com.automationteststore.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicCommands extends TestBase {

    public void click(WebElement element) {

        element.click();

    }

    public void type(WebElement element, String text) {

        element.clear();

        if (text.equals(null)) {

            element.sendKeys("");

        } else {

            element.sendKeys(text);

        }
    }

    public void scroll(WebElement element) {

        JavascriptExecutor je = (JavascriptExecutor) getWebDriver();
        je.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilLoad(By locator, long seconds) {

        WebDriverWait wait = new WebDriverWait(getWebDriver(), seconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    public void waitUntilTime(long milliseconds) {

        try {

            Thread.sleep(milliseconds);

        } catch (InterruptedException ex) {

            System.out.println(ex.getStackTrace());

        }

    }

    public Select select(WebElement element) {

        Select select = new Select(element);

        return select;
    }

}
