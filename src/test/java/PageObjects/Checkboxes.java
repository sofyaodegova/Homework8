package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Checkboxes {
    public static SelenideElement checkbox1 = $(Selenide.element("#checkboxes > input[type=checkbox]:nth-child(1)"));

    public static void selectedCheckbox() {
        checkbox1.click();
        System.out.println("Выбираем чекбокс 1");
        checkbox1.shouldBe(Condition.selected);
        System.out.println("Проверка нажатия: чекбокс 1 нажат");
    }
}