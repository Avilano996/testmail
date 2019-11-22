package testMethods;

import static pages.homePage.HomePageMailRu.*;
import static testMethods.BaseMethods.*;


public class AuthenticationMethods {

    public static void valid_login_in_mail() {
        waitElementForVisible(logo);
        sendKeysToElement(emailField, "test996100@mail.ru");
        clickOnElement(inputPasswordButton);
        sendKeysToElement(passwordField, "193qcwu!@#QE");
        clickOnElement(loginButton);
        waitElementForVisible(logo);
    }
}