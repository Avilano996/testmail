package testMethods;

import com.github.javafaker.Faker;

import static pages.homePage.IndividualMailPage.*;
import static testMethods.BaseMethods.*;

public class SendMailMethods {

    static Faker faker = new Faker();
    public static String textBody = faker.chuckNorris().fact();

    public static void send_email() {
        waitElementForVisible(mailLogo);
        clickOnElement(writeMailButton);
        waitElementForVisible(toField);
        setValueToElement(toField, "abigor76@gmail.com");
        sendKeysToElement(subjectField, "none subject");
        sendKeysToElement(contentBodyField, textBody);
        clickOnElement(sendButton);
        waitElementForVisible(messegeSentTitle);
    }
}
