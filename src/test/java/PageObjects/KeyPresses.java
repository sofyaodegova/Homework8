package PageObjects;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class KeyPresses {
    public static SelenideElement keyPresses = $x("//*[text()=\"Key Presses\"]");
    public static SelenideElement textForm = $x("//*[@id=\"target\"]");

    public static void sendingText(String text) {
        keyPresses.click();
        System.out.println("Переходим на страницу /key_presses");
        textForm.sendKeys(text);
        $(byText("You entered: " + text.toUpperCase())).shouldBe(Condition.visible);
        System.out.println("Видим символ: " + text.toUpperCase());
    }

    public static void sendingSymbol(String symbol) {
        keyPresses.click();
        System.out.println("Переходим на страницу /key_presses");
        Keys enteredSymbol = Keys.valueOf(symbol);
        textForm.sendKeys(enteredSymbol);
        $(byText("You entered: " + symbol)).shouldBe(Condition.visible);
        System.out.println("Видим символ: " + symbol);
    }
}
