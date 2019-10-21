package com.allianz.test.drivers;

import org.openqa.selenium.WebDriver;

public class TestManager {
    private EnvironmentBehavior environmentBehavior;
    private WebDriver webDriver;
    private TestManager(
            EnvironmentBehavior environmentBehavior,
            WebDriver webDriver) {
       this.environmentBehavior = environmentBehavior;
       this.webDriver = webDriver;
    }

    public static class Builder {
        private EnvironmentBehavior environmentBehavior;
        private WebDriver webDriver;

        public Builder() {}

        public Builder withEnvironmentehavior(EnvironmentBehavior environmentBehavior) {
            this.environmentBehavior = environmentBehavior;
            return this;
        }

        public Builder withDriver(WebDriver webDriver) {
            this.webDriver = webDriver;
            return this;
        }

        public TestManager build() {
            return new TestManager(environmentBehavior, webDriver);
        }
    }

    public String getWebDriverName() {
        return this.webDriver.getClass().getName();
    }

    public String getEnvironmentName() {
        return this.environmentBehavior.getClass().getName();
    }

    // TODO: Try to define some decent functionality here.
}
