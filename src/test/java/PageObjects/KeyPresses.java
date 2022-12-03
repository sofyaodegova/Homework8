package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class KeyPresses {

    public static SelenideElement textForm = $(Selenide.element("#target"));
    public static SelenideElement youEntered = $(Selenide.element("#result"));

    public static void sendingText(String text) {
        textForm.sendKeys(text);
        System.out.println("Вводим символ: " + text);
        youEntered.should(Condition.visible);
    }
}
