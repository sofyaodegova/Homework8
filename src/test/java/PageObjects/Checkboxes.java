package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Checkboxes {
    public static SelenideElement checkboxesLink = $x("//*[text()=\"Checkboxes\"]");
    public static SelenideElement checkbox1 = $x("//*[text()=\" checkbox 1\"]/input");

    public static void selectedCheckbox() {
        checkboxesLink.click();
        System.out.println("Переходим на страницу /checkboxes");
        checkbox1.click();
        System.out.println("Выбираем чекбокс 1");
        checkbox1.shouldBe(Condition.selected);
        System.out.println("Проверка нажатия: чекбокс 1 нажат");
    }
}