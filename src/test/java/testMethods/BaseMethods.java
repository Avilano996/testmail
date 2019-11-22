package testMethods;

        import com.codeborne.selenide.SelenideElement;

        import static com.codeborne.selenide.Condition.enabled;
        import static com.codeborne.selenide.Condition.visible;

public class BaseMethods {

    public static void clickOnElement(SelenideElement element) {
        element.shouldBe(visible).shouldBe(enabled).click();
    }

    public static void sendKeysToElement(SelenideElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void setValueToElement(SelenideElement element, String text) {
        element.hover();
        element.setValue(text);
    }

    public static void waitElementForVisible(SelenideElement element) {
        element.waitUntil(visible, 60000, 1000);
    }
}