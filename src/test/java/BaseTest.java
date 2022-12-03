import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setUpBrowser() {
        WebDriverRunner.isChrome();
    }

    @After
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}