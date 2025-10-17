package com.automationteststore.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static Properties properties = null;
    public static WebDriver driver = null;

    public static Properties readProperties() {

        try {

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/resources/configurations/config.properties");
            properties = new Properties();
            properties.load(file);

        } catch (IOException ex) {

            System.out.println("Cannot access file.");
            System.out.println(ex.getStackTrace());

        }

        return properties;

    }

    public static void setupWebDriver(String browser) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(readProperties().getProperty("website"));

    }

    public static WebDriver getWebDriver() {

        return driver;

    }
}
