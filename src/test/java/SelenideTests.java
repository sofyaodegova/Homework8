import PageObjects.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideTests {
    MainPage mainPage = new MainPage();

    @Test
    public void checkboxesTest() {
        mainPage.openMainPage();
        Checkboxes.selectedCheckbox();
    }

    @Test
    public void formAuthenticationPositiveTest() {

        mainPage.openMainPage();
        System.out.println("Переходим на страницу /login");
        FormAuthentication.successfulAuthentication();
    }

    @Test
    public void formAuthenticationNegativeTest() {

        SelenideElement formAuthenticationUrl = $(Selenide.element("#content > ul > li:nth-child(21) > a"));

        mainPage.openMainPage();
        formAuthenticationUrl.click();
        System.out.println("Переходим на страницу /login");
        System.out.println("Попытка зайти в аккаунт с некорректным паролем");
        FormAuthentication.unsuccessfulAuthentication();
    }

    @Test
    public void hoversTesting() {
        mainPage.openMainPage();
        Hovers.visibleText();
    }

    @Test
    public void dynamicallyLoadedPageTesting() {
        mainPage.openMainPage();
        DynamicallyLoadedPage.dynamicallyLoadedPage();
    }

    @Test
    public void keyPressesText() {
        mainPage.openMainPage();
        KeyPresses.sendingText("a");
    }

    @Test
    public void keyPressesSymbol() {
        mainPage.openMainPage();
        KeyPresses.sendingSymbol("SPACE");
    }


    @Test
    public void addRemoveTesting() {
        mainPage.openMainPage();
        AddRemoveElements.addRemove(5);
    }
}