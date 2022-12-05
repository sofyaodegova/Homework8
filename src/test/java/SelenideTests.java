import PageObjects.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideTests {
    @Before
    public void setUpBrowser() {
        WebDriverRunner.isChrome();
        MainPage.openMainPage();
    }

    @Test
    public void checkboxesTest() {
        Checkboxes.selectedCheckbox();
    }

    @Test
    public void formAuthenticationPositiveTest() {
        System.out.println("Переходим на страницу /login");
        FormAuthentication.successfulAuthentication();
    }

    @Test
    public void formAuthenticationNegativeTest() {

        SelenideElement formAuthenticationUrl = $(Selenide.element("#content > ul > li:nth-child(21) > a"));

        formAuthenticationUrl.click();
        System.out.println("Переходим на страницу /login");
        System.out.println("Попытка зайти в аккаунт с некорректным паролем");
        FormAuthentication.unsuccessfulAuthentication();
    }

    @Test
    public void hoversTesting() {

        Hovers.visibleText();
    }

    @Test
    public void dynamicallyLoadedPageTesting() {

        DynamicallyLoadedPage.dynamicallyLoadedPage();
    }

    @Test
    public void keyPressesText() {

        KeyPresses.sendingText("a");
    }

    @Test
    public void keyPressesSymbol() {

        KeyPresses.sendingSymbol("SPACE");
    }


    @Test
    public void addRemoveTesting() {

        AddRemoveElements.addRemove(5);
    }

    @After
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}