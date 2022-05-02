package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement SideBarItem;
    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'televizor')]")
    private  WebElement CategoriesTVItem;
    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'televizor')]")
    private  WebElement TVItem;
    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> TvList;
    public List<WebElement> GetItemsFromCategory()
    {
        SideBarItem.click();
        CategoriesTVItem.click();
        TVItem.click();
        return TvList;
    }
}
