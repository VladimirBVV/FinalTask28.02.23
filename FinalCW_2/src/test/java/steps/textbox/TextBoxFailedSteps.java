package steps.textbox;

import pages.textbox.TextBoxFailedPage;

public class TextBoxFailedSteps {

    TextBoxFailedPage textBoxPage = new TextBoxFailedPage();
    public void verifyThatDivOutputAbsent() {
        textBoxPage.assertThatOutputEmailAbsent();
    }
}
