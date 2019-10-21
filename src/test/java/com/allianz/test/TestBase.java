package com.allianz.test;

import com.allianz.test.drivers.TestManager;
import com.allianz.test.drivers.WebEnvironmentBehavior;
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
    public static Iterable<TestManager> testManagers() {
        TestManager firefoxWebDriver =
                new TestManager
                        .Builder()
                        .withEnvironmentehavior(new WebEnvironmentBehavior())
                        .withDriver(new FirefoxDriver())
                        .build();

        TestManager chromeWebDriver =
                new TestManager
                        .Builder()
                        .withEnvironmentehavior(new WebEnvironmentBehavior())
                        .withDriver(new ChromeDriver())
                        .build();

        // Commented out because I don't have the appium stuff on my machine, but you get the message.
//        TestManager appiumDriver =
//                new TestManager
//                        .Builder()
//                        .withEnvironmentehavior(new MobileEnvironmentBehavior<WebElement>())
//                        .withDriver(new AndroidDriver<WebElement>(new ChromeOptions()))
//                        .build();

        return Arrays.asList(firefoxWebDriver, chromeWebDriver); // ... etc.
    }

    protected final TestManager testManager;

    public TestBase(TestManager testManager) {
        this.testManager = testManager;
    }
}
