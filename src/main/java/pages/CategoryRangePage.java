package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class CategoryRangePage extends CategoryPage {
    public CategoryRangePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[contains(@class,'form-control-min')]")
    private WebElement LeftRange;
    @FindBy(xpath = "//input[contains(@class,'form-control-max')]")
    private WebElement RightRange;
    @FindBy(xpath ="//div[@class='form-group filter-group js_filter_parent open-filter-tooltip']/a[@class='filter-tooltip js_filters_accept']")
    WebElement ShowItemsButton;
    @FindBy(xpath ="//div[@class='prod-cart__prise-new']")
    List<WebElement> TvList;
    public List<WebElement> GetItemsFromCategoryFromLeftToRightBounds(CharSequence Left, CharSequence Right)
    {
        GetItemsFromCategory();
        LeftRange.clear();
        LeftRange.sendKeys(Left);
        RightRange.clear();
        RightRange.sendKeys(Right);
        RightRange.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ShowItemsButton.click();
        return TvList;
    }
}
