package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Hovers {
    public static SelenideElement img = $(Selenide.element("#content > div > div:nth-child(4) > img"));
    public static SelenideElement name = $(Selenide.element("#content > div > div:nth-child(4) > div > h5"));
    public static SelenideElement viewProfile = $(Selenide.element("#content > div > div:nth-child(4) > div > a"));

    public static void visibleText() {
        img.hover();
        System.out.println("Навожу курсор на изображение");
        name.shouldBe(Condition.visible);
        viewProfile.shouldBe(Condition.visible);
        System.out.println("Вижу имя пользователя и ссылку на профиль");
    }
}
