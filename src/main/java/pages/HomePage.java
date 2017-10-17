package pages;

import com.thoughtworks.gauge.Step;

public class HomePage extends BasePage {
    
    @Step("Navigate to the homepage")
    public void navigateTo() {
        // TODO: Add code to navigate to wikipedia.org and verify that the page has loaded
    }

    @Step("Verify all languages are visible")
    public void verifyLanguagesAreVisible() {
        // TODO: Add code to get the elements for the main languages and verify the elements are visible
        
    }
    
    @Step("Search for exact page <searchTerm>")
    public void exactPageSearch(String searchTerm) {
        // TODO: Add code performing a search to an existing page and verifying the proper page was reached
        
    }
    
}
