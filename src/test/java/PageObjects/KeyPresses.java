package PageObjects;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class KeyPresses {
    public static SelenideElement keyPresses = $x("//*[text()=\"Key Presses\"]");
    public static SelenideElement textForm = $x("//*[@id=\"target\"]");

    public static void sendingText(String text) {
        keyPresses.click();
        System.out.println("Переходим на страницу /key_presses");
        textForm.sendKeys(text);
        SelenideElement youEntered = $x("//*[text()=\"You entered: \"]");
        System.out.println("Вводим символ: " + text);
        youEntered.should(Condition.visible);
    }
}
