package com.fundacionjala.pivotal.framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements IDriver {

    private static String driverPath = "lib/";

    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        return new ChromeDriver();
    }
}
