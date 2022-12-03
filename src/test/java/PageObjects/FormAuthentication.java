package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class FormAuthentication {

    public static SelenideElement usernameForm = $(Selenide.element("#username"));
    public static SelenideElement passwordForm = $(Selenide.element("#password"));
    public static SelenideElement loginButton = $(Selenide.element("#login > button > i"));
    public static SelenideElement logoutButton = $(Selenide.element("#content > div > a > i"));
    public static SelenideElement successText = $(Selenide.element("#flash.flash.success"));
    public static SelenideElement errorText = $(Selenide.element("#flash.flash.error"));

    public static void successfulAuthentication() {
        usernameForm.val("tomsmith");
        System.out.println("Заполняю корректный логин");
        passwordForm.val("SuperSecretPassword!");
        System.out.println("Заполняю корректный пароль");
        loginButton.click();
        System.out.println("Нажимаю на кнопку логин");
        successText.shouldBe(Condition.visible);
        System.out.println("You logged into a secure area!");
        logoutButton.click();
        System.out.println("Выхожу из аккаунта");
    }

    public static void unsuccessfulAuthentication() {
        usernameForm.val("tomsmith");
        System.out.println("Заполняю корректный логин");
        passwordForm.val("WrongPassword!");
        System.out.println("Заполняю НЕКОРРЕКТНЫЙ пароль");
        loginButton.click();
        System.out.println("Нажимаю на кнопку логин");
        errorText.shouldBe(Condition.visible);
        System.out.println("Your password is invalid!");
    }
}