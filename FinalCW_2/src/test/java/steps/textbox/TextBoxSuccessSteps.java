package steps.textbox;

import pages.textbox.TextBoxSuccessPage;

public class TextBoxSuccessSteps extends TextBoxSteps {

    TextBoxSuccessPage textBoxPage = new TextBoxSuccessPage();

    public void verifyThatOutputPresent() {
        textBoxPage.assertThatOutputPresent();
    }
}
