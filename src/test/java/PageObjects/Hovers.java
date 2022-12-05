package PageObjects;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Hovers {
    public static SelenideElement hovers = $x("//*[text()=\"Hovers\"]");
    public static SelenideElement img = $x("*//div[2]/img");
    public static SelenideElement name = $x("//*[text()=\"name: user2\"]");
    public static SelenideElement viewProfile = $x("//*[@class=\"figure\"]/../..//*[@href=\"/users/2\"]");

    public static void visibleText() {
        hovers.click();
        System.out.println("Переходим на страницу /hovers");
        img.hover();
        System.out.println("Навожу курсор на изображение №2");
        name.shouldBe(Condition.visible);
        viewProfile.shouldBe(Condition.visible);
        System.out.println("Вижу имя пользователя №2 и ссылку на профиль №2");
    }
}
