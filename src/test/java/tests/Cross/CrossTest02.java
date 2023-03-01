package tests.Cross;

import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class CrossTest02 extends TestBaseCross {
    @Test
    public void test02() throws InterruptedException {
        driver.get("http://techproeducation.com");

        Thread.sleep(2000);
    }
}
