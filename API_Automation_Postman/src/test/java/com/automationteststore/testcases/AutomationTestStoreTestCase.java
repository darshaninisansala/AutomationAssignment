package com.automationteststore.testcases;

import com.automationteststore.pages.AutomationTestStoreHomePage;
import com.automationteststore.pages.AutomationTestStoreLoginPage;
import com.automationteststore.report.Report;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestStoreTestCase extends Report {

    AutomationTestStoreLoginPage loginPage = new AutomationTestStoreLoginPage();
    AutomationTestStoreHomePage homePage = new AutomationTestStoreHomePage();

    @BeforeTest
    public void initialLoad() {

        setupWebDriver("chrome");

    }

    @Test(priority = 1)
    public void verifyLogin() throws InterruptedException {

        createTest("Login", "Login Test Case");
        loginPage.validateLogin("darshani","19990820DN@s");

    }

    @Test(priority = 2)
    public void verifyProductSearchAndAddToCart() throws InterruptedException {

        createTest("Product Search and Add to Cart", "Product Search and Add to Cart Test Case");
        loginPage.validateLogin("darshani","19990820DN@s");
        homePage.validateProductSearchAndAddToCart();

    }

    @Test(priority = 3)
    public void verifySingleProductCheckout() throws InterruptedException {

        createTest("Single Product Checkout", "Single Product Checkout Test Case");
        loginPage.validateLogin("darshani","19990820DN@s");
        homePage.validateProductSearchAndAddToCart();
        homePage.validateSingleProductCheckout();

    }

    @Test(priority = 4)
    public void verifyEmptyCartCheckout() throws InterruptedException {

        createTest("Empty Cart Checkout", "Empty Cart Checkout Test Case");
        loginPage.validateLogin("darshani","19990820DN@s");
        homePage.validateEmptyCartCheckout();

    }
}
