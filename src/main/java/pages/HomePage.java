package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //private static final String SEARCH_INPUT = "//input[@id='input_search']";
    //private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement SearchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement SearchButton;

    public void SearchByKeyword(final String keyword){
        //driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        //driver.findElement(By.xpath(SEARCH_BUTTON)).click();
        SearchInput.sendKeys(keyword);
        SearchButton.click();
    }
}
