package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    //private static final String SEARCH_RESULTS_PRODUCTS_LIST = "//div[@class='prod-cart__descr']";
    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> SearchResultsProductsList;
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList(){
        //return driver.findElements(By.xpath(SEARCH_RESULTS_PRODUCTS_LIST));
        return SearchResultsProductsList;
    }

    public int searchSearchResultsCount(){
        return getSearchResultsList().size();
    }
}
