import PageObjects.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideTests {
    MainPage mainPage = new MainPage();

    @Test
    public void checkboxesTest() {

        SelenideElement checkboxes = $(Selenide.element("#content > ul > li:nth-child(6) > a"));

        mainPage.openMainPage();
        checkboxes.click();
        System.out.println("Переходим на страницу /checkboxes");
        Checkboxes.selectedCheckbox();
    }

    @Test
    public void formAuthenticationPositiveTest() {

        SelenideElement formAuthenticationUrl = $(Selenide.element("#content > ul > li:nth-child(21) > a"));

        mainPage.openMainPage();
        formAuthenticationUrl.click();
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
        SelenideElement hovers = $(Selenide.element("#content > ul > li:nth-child(25) > a"));
        mainPage.openMainPage();
        hovers.click();
        System.out.println("Переходим на страницу /hovers");
        Hovers.visibleText();
    }

    @Test
    public void dynamicallyLoadedPageTesting() {
        SelenideElement dynamicLoading = $(Selenide.element("#content > ul > li:nth-child(14) > a"));
        SelenideElement example2 = $(Selenide.element("#content > div > a:nth-child(8)"));

        mainPage.openMainPage();
        dynamicLoading.click();
        System.out.println("Переходим на страницу /dynamic_loading");
        example2.click();
        System.out.println("Переходим на страницу /dynamic_loading/2");
        DynamicallyLoadedPage.dynamicallyLoadedPage();
    }

    @Test
    public void keyPressesTesting() {
        SelenideElement keyPresses = $(Selenide.element("#content > ul > li:nth-child(31) > a"));

        mainPage.openMainPage();
        keyPresses.click();
        System.out.println("Переходим на страницу /key_presses");
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