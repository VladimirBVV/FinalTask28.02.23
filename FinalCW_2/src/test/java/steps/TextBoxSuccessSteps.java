package steps;

import pages.elements.TextBoxSuccessPage;

public class TextBoxSuccessSteps extends TextBoxSteps {

    TextBoxSuccessPage textBoxPage = new TextBoxSuccessPage();

    public void verifyThatOutputPresent() {
        textBoxPage.assertThatOutputPresent();
    }
}
