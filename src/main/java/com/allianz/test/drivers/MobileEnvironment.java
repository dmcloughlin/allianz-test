package com.allianz.test.drivers;

import io.appium.java_client.AppiumDriver;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
@ToString
public class MobileEnvironment<T extends WebElement> implements Environment {
    private AppiumDriver<T> driver;

    public void navigateToPage(String url) {
        // Do whatever needs to be done to get to the page in a mobile app.
        // Do we need to perform a few steps?
        // 1. Open app.
        // 2. Go to page.
        this.driver.launchApp();
        this.driver.get(url); // I have no idea if this would actually work, but you get the idea.
    }

    public void hitButton(String buttonId) {
        WebElement buttonElement = this.driver.findElement(By.id(buttonId));
        this.driver.tap(1, buttonElement, 1);
    }
}
