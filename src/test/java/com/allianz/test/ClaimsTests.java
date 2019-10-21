package com.allianz.test;

import com.allianz.test.drivers.TestManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClaimsTests extends TestBase {

    public ClaimsTests(TestManager testManager) {
        super(testManager);
    }

    @Test
    public void test() {
        // We should have a different test manager each time the test is run.
        System.out.println(this.testManager.getEnvironmentName());
        System.out.println(this.testManager.getWebDriverName());
    }
}
