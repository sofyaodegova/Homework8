package PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DynamicallyLoadedPage {

    public static SelenideElement startButton = $(Selenide.element("#start > button"));
    public static SelenideElement helloWorldText = $(Selenide.element("div#finish"));
    public static SelenideElement loading = $(Selenide.element("#loading"));

    public static void dynamicallyLoadedPage() {
        startButton.click();
        System.out.println("Нажимаю на кнопку старт");
        loading.shouldBe(disappear, Duration.ofMillis(6000));
        helloWorldText.shouldBe(visible);
        System.out.println("Элемент hello world существует");
    }
}
