package pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {
    
    By body = By.id("www-wikipedia-org");
    
    By languages = By.className("central-featured-lang");
    
    By english = By.id("js-link-box-en");
    By spanish = By.id("js-link-box-es");
    By japanese = By.id("js-link-box-ja");
    By german = By.id("js-link-box-de");
    By russian = By.id("js-link-box-ru");
    By french = By.id("js-link-box-fr");
    By italian = By.id("js-link-box-it");
    By chinese = By.id("js-link-box-zh");
    By portugese = By.id("js-link-box-pt");
    By polish = By.id("js-link-box-pl");

    By searchField = By.id("searchInput");
    By searchButton = By.xpath("//*[@id='search-form']//button");
    
    @Step("Navigate to the homepage")
    public void navigateTo() {
        driver.get("https://www.wikipedia.org");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(body));
    }

    @Step("Verify all languages are visible")
    public void verifyLanguagesAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Method 1: Find elements explicitly
        wait.until(ExpectedConditions.visibilityOfElementLocated(english));
        wait.until(ExpectedConditions.visibilityOfElementLocated(spanish));
        wait.until(ExpectedConditions.visibilityOfElementLocated(japanese));
        wait.until(ExpectedConditions.visibilityOfElementLocated(german));
        wait.until(ExpectedConditions.visibilityOfElementLocated(russian));
        wait.until(ExpectedConditions.visibilityOfElementLocated(french));
        wait.until(ExpectedConditions.visibilityOfElementLocated(italian));
        wait.until(ExpectedConditions.visibilityOfElementLocated(chinese));
        wait.until(ExpectedConditions.visibilityOfElementLocated(portugese));
        wait.until(ExpectedConditions.visibilityOfElementLocated(polish));
        
        // Method 2: Find list of elements from shared class
        List<WebElement> elements = driver.findElements(languages);
        wait = new WebDriverWait(driver, 10);
        for (WebElement element : elements) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }
    
    @Step("Search for exact page <searchTerm>")
    public void exactPageSearch(String searchTerm) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        driver.findElement(searchField).sendKeys(searchTerm);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        driver.findElement(searchButton).click();
        wait.until(ExpectedConditions.urlToBe("https://en.wikipedia.org/wiki/" + searchTerm));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
