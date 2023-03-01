package tests.Cross;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseCross;

public class CrossTest01 extends TestBaseCross {
    @Test
    public void testName() throws InterruptedException {
        driver.get("https://amazon.com");

        Thread.sleep(2000);
        driver.get("http://facebook.com");

        Thread.sleep(2000);
    }
}
