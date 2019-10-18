package com.allianz.test.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.Response;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DriverAdapter<T extends WebElement> {
    private AppiumDriver<T> appiumDriver;
    private WebDriver webDriver;

    public DriverAdapter(AppiumDriver<T> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public DriverAdapter(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Response execute(String s, Map map) {
        return this.appiumDriver.execute(s, map);
    }

    public WebElement findElementByClassName(String s) {
        return this.appiumDriver.findElementByClassName(s);
    }

    public List findElementsByClassName(String s) {
        return this.appiumDriver.findElementsByClassName(s);
    }

    public WebElement findElementByCssSelector(String s) {
        return this.appiumDriver.findElementByCssSelector(s);
    }

    public List findElementsByCssSelector(String s) {
        return this.appiumDriver.findElementsByCssSelector(s);
    }

    public WebElement findElementById(String s) {
        return this.appiumDriver.findElementById(s);
    }

    public List findElementsById(String s) {
        return this.appiumDriver.findElementsById(s);
    }

    public WebElement findElementByLinkText(String s) {
        return this.appiumDriver.findElementByLinkText(s);
    }

    public List findElementsByLinkText(String s) {
        return this.appiumDriver.findElementsByLinkText(s);
    }

    public WebElement findElementByPartialLinkText(String s) {
        return this.appiumDriver.findElementByPartialLinkText(s);
    }

    public List findElementsByPartialLinkText(String s) {
        return this.appiumDriver.findElementsByPartialLinkText(s);
    }

    public WebElement findElementByName(String s) {
        return this.appiumDriver.findElementByName(s);
    }

    public List findElementsByName(String s) {
        return this.appiumDriver.findElementsByName(s);
    }

    public WebElement findElementByTagName(String s) {
        return this.appiumDriver.findElementByTagName(s);
    }

    public List findElementsByTagName(String s) {
        return this.appiumDriver.findElementsByTagName(s);
    }

    public WebElement findElementByXPath(String s) {
        return this.appiumDriver.findElementByXPath(s);
    }

    public List findElementsByXPath(String s) {
        return this.appiumDriver.findElementsByXPath(s);
    }

    public void hideKeyboard() {
        this.appiumDriver.hideKeyboard();
    }

    public String getDeviceTime() {
        return this.appiumDriver.getDeviceTime();
    }

    public WebElement findElementByAccessibilityId(String s) {
        return this.appiumDriver.findElementByAccessibilityId(s);
    }

    public List findElementsByAccessibilityId(String s) {
        return this.appiumDriver.findElementsByAccessibilityId(s);
    }

    public Map<String, String> getAppStringMap() {
        return this.appiumDriver.getAppStringMap();
    }

    public Map<String, String> getAppStringMap(String s) {
        return this.appiumDriver.getAppStringMap(s);
    }

    public Map<String, String> getAppStringMap(String s, String s1) {
        return this.appiumDriver.getAppStringMap();
    }

    public void launchApp() {
        this.appiumDriver.launchApp();
    }

    public void installApp(String s) {
        this.appiumDriver.installApp(s);
    }

    public boolean isAppInstalled(String s) {
        return this.appiumDriver.isAppInstalled(s);
    }

    public void resetApp() {
        this.appiumDriver.resetApp();
    }

    public void runAppInBackground(int i) {
        this.appiumDriver.runAppInBackground(i);
    }

    public void removeApp(String s) {
        this.appiumDriver.removeApp(s);
    }

    public void closeApp() {
        this.appiumDriver.closeApp();
    }

    public byte[] pullFile(String s) {
        return this.appiumDriver.pullFile(s);
    }

    public byte[] pullFolder(String s) {
        return this.appiumDriver.pullFolder(s);
    }

    public TouchAction performTouchAction(TouchAction touchAction) {
        return this.appiumDriver.performTouchAction(touchAction);
    }

    public void performMultiTouchAction(MultiTouchAction multiTouchAction) {
        this.appiumDriver.performMultiTouchAction(multiTouchAction);
    }

    public void zoom(int i, int i1) {
        this.appiumDriver.zoom(i, i1);
    }

    public void zoom(WebElement webElement) {
        this.appiumDriver.zoom(webElement);
    }

    public void tap(int i, int i1, int i2, int i3) {
        this.appiumDriver.tap(i, i1, i2, i3);
    }

    public void tap(int i, WebElement webElement, int i1) {
        this.appiumDriver.tap(i, webElement, i1);
    }

    public void swipe(int i, int i1, int i2, int i3, int i4) {
        this.appiumDriver.swipe(i, i1, i2, i3, i4);
    }

    public void pinch(int i, int i1) {
        this.appiumDriver.pinch(i, i1);
    }

    public void pinch(WebElement webElement) {
        this.appiumDriver.pinch(webElement);
    }

    public WebDriver context(String s) {
        return this.appiumDriver.context(s);
    }

    public Set<String> getContextHandles() {
        return this.appiumDriver.getContextHandles();
    }

    public String getContext() {
        return this.appiumDriver.getContext();
    }

    public void rotate(ScreenOrientation screenOrientation) {
        this.appiumDriver.rotate(screenOrientation);
    }

    public ScreenOrientation getOrientation() {
        return this.appiumDriver.getOrientation();
    }

    public void rotate(DeviceRotation deviceRotation) {
        this.appiumDriver.rotate(deviceRotation);
    }

    public DeviceRotation rotation() {
        return this.appiumDriver.rotation();
    }

    public void get(String s) {
        this.appiumDriver.get(s);
    }

    public String getCurrentUrl() {
        return this.appiumDriver.getCurrentUrl();
    }

    public String getTitle() {
        return this.appiumDriver.getTitle();
    }

    public List<WebElement> findElements(By by) {
        return this.webDriver.findElements(by);
    }

    public WebElement findElement(By by) {
        return this.webDriver.findElement(by);
    }

    public String getPageSource() {
        return this.webDriver.getPageSource();
    }

    public void close() {
        this.webDriver.close();
    }

    public void quit() {
        this.webDriver.quit();
    }

    public Set<String> getWindowHandles() {
        return this.webDriver.getWindowHandles();
    }

    public String getWindowHandle() {
        return this.webDriver.getWindowHandle();
    }

    public WebDriver.TargetLocator switchTo() {
        return this.webDriver.switchTo();
    }

    public WebDriver.Navigation navigate() {
        return this.webDriver.navigate();
    }

    public WebDriver.Options manage() {
        return this.webDriver.manage();
    }

    public Location location() {
        return this.appiumDriver.location();
    }

    public void setLocation(Location location) {
        this.appiumDriver.setLocation(location);
    }
}
