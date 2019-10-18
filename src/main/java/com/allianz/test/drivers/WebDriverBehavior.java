package com.allianz.test.drivers;

import org.openqa.selenium.WebDriver;

public class WebDriverBehavior extends DriverBehavior {
    private WebDriver webDriver;
    public WebDriverBehavior(WebDriver webDriver) {
       this.webDriver = webDriver;
    }
}
