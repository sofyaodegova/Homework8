package PageObjects;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedPage {
    public static SelenideElement dynamicLoading = $x("//*[text()=\"Dynamic Loading\"]");
    public static SelenideElement example2 = $x("//*[text()=\"Example 2: Element rendered after the fact\"]");

    public static SelenideElement startButton = $x("//*[text()=\"Start\"]");
    public static SelenideElement helloWorldText = $x("//*[text()=\"Hello World!\"]");
    public static SelenideElement loading = $x("//*[text()=\"Loading... \"]");

    public static void dynamicallyLoadedPage() {
        dynamicLoading.click();
        System.out.println("Переходим на страницу /dynamic_loading");
        example2.click();
        System.out.println("Переходим на страницу /dynamic_loading/2");
        startButton.click();
        System.out.println("Нажимаю на кнопку старт");
        loading.shouldBe(disappear, Duration.ofMillis(6000));
        helloWorldText.shouldBe(visible);
        System.out.println("Элемент hello world существует");
    }
}
