package avic_tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SignInButtonTest extends BaseTest{
    private  static final String EXPECTED_URL = "https://avic.ua/ua/sign-in";
    private  static final String UNREGISTERED_LOGIN = "HelloUser";
    private  static final String UNREGISTERED_PASSWORD = "HelloPassword";

    @Test
    public void checkThatSigninButtonOpensRegPage(){
        JavaScriptClick((getRegPage().getRegImgButton()));
        assertEquals( EXPECTED_URL, getDriver().getCurrentUrl() );
    }
    @Test
    public void checkThatUnregisteredUserDoesntLogin(){
        getRegPage().PutLoginAndPassword(UNREGISTERED_LOGIN,UNREGISTERED_PASSWORD);
        assertEquals( EXPECTED_URL, getDriver().getCurrentUrl() );
    }
}

