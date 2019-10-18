package com.allianz.test;

import com.allianz.test.drivers.MobileBrowserBehavior;
import com.allianz.test.drivers.TestManager;
import com.allianz.test.drivers.WebDriverBehavior;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {


        TestManager firefoxWebDriver =
                new TestManager
                    .Builder()
                        .withDriverBehavior(new WebDriverBehavior(new FirefoxDriver()))
                        .build();

        TestManager chromeMobileDriver =
                new TestManager
                .Builder()
                        .withDriverBehavior(new MobileBrowserBehavior<WebElement>(new AndroidDriver<WebElement>(new ChromeOptions())))
                        .build();



    }
}
