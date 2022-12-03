package PageObjects;

import com.codeborne.selenide.Selenide;

public class MainPage {

    String baseUrl = "https://the-internet.herokuapp.com/";

    public void openMainPage() {
        Selenide.open(baseUrl);
        System.out.println("Открываю страницу: " + baseUrl);
    }
}