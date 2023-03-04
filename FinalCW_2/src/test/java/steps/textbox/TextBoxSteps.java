package steps.textbox;

import lombok.SneakyThrows;
import pages.textbox.TextBoxPage;

public class TextBoxSteps {

    TextBoxPage textBoxPage = new TextBoxPage();

    @SneakyThrows
    public TextBoxSuccessSteps doTextBox(String name, String email, String currentAddress, String permanentAddress) {
        inputTextBoxData(name, email, currentAddress, permanentAddress);
        return new TextBoxSuccessSteps();
    }

    @SneakyThrows
    public TextBoxFailedSteps doIncorrectTextBox(String name, String email, String currentAddress, String permanentAddress) {
        inputTextBoxData(name, email, currentAddress, permanentAddress);
        return new TextBoxFailedSteps();
    }

    @SneakyThrows
    private void inputTextBoxData(String name, String email, String currentAddress, String permanentAddress) {
        textBoxPage.fillUserName(name);
        textBoxPage.fillUserEmail(email);
        textBoxPage.fillCurrentAddress(currentAddress);
        textBoxPage.fillPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();
    }
}
