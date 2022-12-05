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
    public void keyPressesTesting() {
        mainPage.openMainPage();
        KeyPresses.sendingText("a");
    }

    @Test
    public void addRemoveTesting() {
        SelenideElement addRemoveElements = $(Selenide.element("#content > ul > li:nth-child(2) > a"));
        mainPage.openMainPage();
        addRemoveElements.click();
        System.out.println("Переходим на страницу /add_remove_elements");
        AddRemoveElements.addRemove();
    }
}