package com.allianz.test.drivers;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@AllArgsConstructor
@ToString
public class WebEnvironment implements Environment {
    private WebDriver webDriver;

    public void navigateToPage(String url) {
        this.webDriver.get(url);
    }

    public void hitButton(String buttonId) {
        this.webDriver.findElement(By.id(buttonId)).click();
    }
}
