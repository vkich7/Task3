package avic_tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class CategoriesTests extends BaseTest {
        static final String ExpectedTextForEachItem = "Телевізор";
        CharSequence LeftBound = "10000";
        CharSequence RightBound ="20000";

        @Test
        public void checkThatResultContainsCategoryName() {
                for (WebElement webElement : getCategoryPage().GetItemsFromCategory()) {
                        assertTrue(webElement.getText().contains(ExpectedTextForEachItem));
                }
        }

        @Test
        public void checkThatResultItemsWithinBounds() {
                for (WebElement WebEl : getCategoryRangePage().GetItemsFromCategoryFromLeftToRightBounds(LeftBound, RightBound)) {
                        int Price = Integer.parseInt(WebEl.getText().substring(0, WebEl.getText().length() - 4));
                        assertTrue((Price > Integer.parseInt(LeftBound.toString())) && (Price < Integer.parseInt(RightBound.toString())));
                }
        }
}


