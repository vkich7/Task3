package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends BasePage{
    public RegPage(WebDriver driver) {
        super(driver);
    }
    private static final String LOG_URL = "https://avic.ua/ua/sign-in";
    //private static final String SIGNIN_IMG = "//div[contains(text(),'Увійти')]/..";
    //private static final String LOGIN_INPUT = "//main//input[@class='validate']";
    //private static final String PASSWORD_INPUT = "//input[@class='validate show-password']";
    //private static final String SUBMIT_BUTTON = "//main//button[@type='submit']";
    @FindBy(xpath = "//div[contains(text(),'Увійти')]/..")
    private WebElement SignInImg;
    @FindBy(xpath = "//main//input[@class='validate']")
    private WebElement LoginInput;
    @FindBy(xpath = "//input[@class='validate show-password']")
    private WebElement PasswordInput;
    @FindBy(xpath = "//input[@class='validate show-password']")
    private WebElement SubmitButton;
    public WebElement getRegImgButton(){
        return SignInImg;
    }
    public void PutLoginAndPassword(String login, String password)
    {
        driver.get(LOG_URL);
        LoginInput.sendKeys(login);
        PasswordInput.sendKeys(password);
        SubmitButton.click();
    }
}
