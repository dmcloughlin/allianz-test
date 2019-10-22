package com.allianz.test;

import com.allianz.test.drivers.DriverManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClaimsTests extends TestBase {

    public ClaimsTests(DriverManager driverManager) {
        super(driverManager);
    }

    @Test
    public void test() {
        // This test will be run the same number of times as there are driver managers supplied.
        System.out.println(this.driverManager.getEnvironment());
    }
}
