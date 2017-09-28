package pages;

import common.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverFactory.getDriver();
    }

    public void resetApp() {
        driver.close();
    }

}
