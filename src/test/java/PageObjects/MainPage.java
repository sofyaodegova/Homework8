package PageObjects;

import com.codeborne.selenide.Selenide;

public class MainPage {

    public static String baseUrl = "https://the-internet.herokuapp.com/";

    public static void openMainPage() {
        Selenide.open(baseUrl);
        System.out.println("Открываю страницу: " + baseUrl);
    }
}