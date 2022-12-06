package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AddRemoveElements {
    public static SelenideElement addRemoveElements = $x("//*[text()=\"Add/Remove Elements\"]");
    public static SelenideElement addElementButton = $x("//*[text()=\"Add Element\"]");
    public static ElementsCollection deleteButton = $$x("//*[text()=\"Delete\"]");

    public static void addRemove(Integer count) {

        addRemoveElements.click();

        System.out.println("Переходим на страницу /add_remove_elements");
        for (int i = 0; deleteButton.size() != count; i++) {
            addElementButton.click();
            deleteButton.get(i).shouldBe(Condition.visible);
        }
        System.out.println("Добавили кнопку delete " + count + " раз");
    }
}