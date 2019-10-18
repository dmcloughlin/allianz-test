package com.allianz.test;

import com.allianz.test.drivers.DriverAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {
    public static void main(String[] args) {

        DriverAdapter<?> androidFirefoxDriver = new DriverAdapter<WebElement>(new AndroidDriver<WebElement>(new FirefoxOptions()));
        DriverAdapter<?> iosChromeDriver = new DriverAdapter<WebElement>(new IOSDriver<WebElement>(new ChromeOptions()));

        DriverAdapter<?> webFirefoxDriver = new DriverAdapter<WebElement>(new FirefoxDriver());
        DriverAdapter<?> webChromeDriver = new DriverAdapter<WebElement>(new ChromeDriver());



    }
}
