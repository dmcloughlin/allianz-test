package com.allianz.test.drivers;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.WebElement;

public class MobileBrowserBehavior<T extends WebElement> extends DriverBehavior {
    private MobileDriver<T> mobileDriver;
    public MobileBrowserBehavior(MobileDriver<T> driver) {
        this.mobileDriver = driver;
    }
}
