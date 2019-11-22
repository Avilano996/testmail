package pages.homePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class IndividualMailPage {

    public static final SelenideElement
            writeMailButton = $(byXpath("//*[contains(@data-title-shortcut, 'N')]")),
            mailLogo = $(byXpath("//*[contains(@class, 'portal-menu__logo')]")),
            toField = $(byXpath("//*[contains(@class, 'container--H9L5q size_s_compressed--2c-eV dark--7GF6F')]")),
            subjectField = $(byName("Subject")),
            contentBodyField = $(byXpath("//*[contains(@tabindex, '505')]")),
            sendButton = $(byXpath("//*[contains(@tabindex, '570')]")),
            messegeSentTitle = $(byXpath("//*[contains(@class, 'layer__header')]"));
}
