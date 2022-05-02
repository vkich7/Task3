package avic_tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.CategoryPage;
import pages.CategoryRangePage;
import pages.HomePage;
import pages.RegPage;
import pages.SearchResultsPage;
import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    WebDriver driver;
    private static String AVIC_URL = "https://avic.ua/";
    @BeforeTest
    public  void profileSetup(){
        chromedriver().setup();
    }
    @BeforeMethod
    public void testsSetup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }
    public SearchResultsPage getSearchResultsPage(){
        return new SearchResultsPage(getDriver());
    }
    public RegPage getRegPage(){
        return new RegPage(getDriver());
    }

    public CategoryPage getCategoryPage(){
        return new CategoryPage(getDriver());
    }

    public CategoryRangePage getCategoryRangePage(){
        return new CategoryRangePage(getDriver());
    }

    public void implisitWait(long timeToWait){
        //driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeToWait));
    }
    public void JavaScriptClick (WebElement elementForClick){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementForClick);
    }
}
