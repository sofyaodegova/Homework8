package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElements {

    public static SelenideElement addElementButton = $(Selenide.element("#content > div > button"));
    public static SelenideElement deleteButton = $(Selenide.element("#elements > button"));


    public static void addRemove() {
        addElementButton.click();
        deleteButton.should(Condition.visible);
        System.out.println("Добавили кнопку delete");
        deleteButton.click();
        System.out.println("Нажали на кнопку delete");
        deleteButton.should(Condition.disappear);
        System.out.println("Кнопка delete исчезла");
    }
}