package com.allianz.test.drivers;

import org.openqa.selenium.WebDriver;

public class TestManager {
    private DriverBehavior driverBehavior;
    private WebDriver webDriver;
    private TestManager(
            DriverBehavior driverBehavior,
            WebDriver webDriver) {
       this.driverBehavior = driverBehavior;
       this.webDriver = webDriver;
    }

    public static class Builder {
        private DriverBehavior driverBehavior;
        private WebDriver webDriver;

        public Builder() {}

        public Builder withDriverBehavior(DriverBehavior driverBehavior) {
            this.driverBehavior = driverBehavior;
            return this;
        }

        public TestManager build() {
            return new TestManager(driverBehavior, webDriver);
        }
    }
}
