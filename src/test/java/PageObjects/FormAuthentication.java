package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormAuthentication {

    public static SelenideElement formAuthenticationUrl = $x("//*[text()=\"Form Authentication\"]");
    public static SelenideElement usernameForm = $x("//*[@id=\"username\"]");
    public static SelenideElement passwordForm = $x("//*[@id=\"password\"]");
    public static SelenideElement loginButton = $x("//*[@id=\"login\"]/button");
    public static SelenideElement logoutButton = $x("//*[text()=\" Logout\"]");
    public static SelenideElement successText = $x("//*[@class=\"flash success\"]");
    public static SelenideElement errorText = $x("//*[@class=\"flash error\"]");

    public static void successfulAuthentication() {
        formAuthenticationUrl.click();
        System.out.println("Перехожу на страницу с формой аутентификации");
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