package com.allianz.test;

import com.allianz.test.drivers.DriverManager;
import com.allianz.test.drivers.WebEnvironment;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;

public abstract class TestBase {
    static {
        System.setProperty("webdriver.gecko.driver", "/Users/dmcloughlin/Downloads/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/dmcloughlin/Downloads/chromedriver-v77");
    }

    @Parameterized.Parameters(name = "Combinations of environments and drivers.")
    public static Iterable<DriverManager> testManagers() {
        DriverManager firefoxDriverManager =
           DriverManager
                   .builder()
                   .environment(new WebEnvironment(new FirefoxDriver()))
                   .build();

        DriverManager chromeDriverManager =
                DriverManager
                .builder()
                .environment(new WebEnvironment(new ChromeDriver()))
                .build();

        // No idea how to run Appium so commenting out for now.
//        DriverManager androidChromeDriverManager =
//                DriverManager
//                .builder()
//                .environment(new MobileEnvironment<WebElement>(new AndroidDriver<WebElement>(new ChromeOptions())))
//                .build();

        return Arrays.asList(firefoxDriverManager, chromeDriverManager); // etc...
    }

    protected final DriverManager driverManager;

    public TestBase(DriverManager driverManager) {
        this.driverManager = driverManager;
    }
}
