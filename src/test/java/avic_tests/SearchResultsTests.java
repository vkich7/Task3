package avic_tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SearchResultsTests extends BaseTest {
    private static final String SEARCH_KEYWORD = "IPhone 13";
    private static final String EXPECTED_QUERY = "query=IPhone";
    private static final int EXPECTED_SIZE = 12;
    @Test
    public void checkThatMethodContainsSearchWord(){
        getHomePage().SearchByKeyword(SEARCH_KEYWORD);
        assertTrue(driver.getCurrentUrl().contains(EXPECTED_QUERY));
    }
    @Test
    public void CheckElementsAmountOnSearchPage(){
        getHomePage().SearchByKeyword(SEARCH_KEYWORD);
        implisitWait(10);
        int actualElementsSize = getSearchResultsPage().searchSearchResultsCount();
        assertEquals(actualElementsSize, EXPECTED_SIZE);
    }

    @Test
    public void CheckSearchResultsContainsSearchWords() {
        getHomePage().SearchByKeyword(SEARCH_KEYWORD);
        implisitWait(20);
        for (WebElement webElement : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElement.getText().toLowerCase().contains(SEARCH_KEYWORD.toLowerCase()));
        }
    }
}
