package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static testMethods.AuthenticationMethods.valid_login_in_mail;
import static testMethods.SendMailMethods.send_email;

public class MailTest {
    @Before
    public void before() {
        open("https://mail.ru/");
        getWebDriver().manage().window().maximize();
    }

    @After
    public void clearCache() {
        clearBrowserCache();
        close();
    }

    @Test
    public void login_and_send_email() {
        valid_login_in_mail();
        send_email();
    }
}