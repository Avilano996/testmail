package pages.homePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePageMailRu {

    public static final SelenideElement
            logo = $(byId("logo")),
            emailField = $(byName("login")),
            inputPasswordButton = $(byId("mailbox:submit")),
            passwordField = $(byName("password")),
            loginButton = $(byXpath("//*[contains(@class, 'btn btn_blue mailbox__control mailbox__control_twostep mailbox__rwd-control mailbox__control_twostep-short')]"));
}
