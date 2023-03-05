package tests.textbox;

import org.testng.annotations.Test;
import steps.textbox.TextBoxFailedSteps;

public class TextBoxFailedTest extends TextBoxTest {

    @Test(dataProvider = "textBoxFailed")
    public void testTextBoxFailedString (String name, String email, String currentAddress, String permanentAddress) {
        TextBoxFailedSteps textBoxSteps1 = textBoxSteps.doIncorrectTextBox(name, email, currentAddress, permanentAddress);
        textBoxSteps1.verifyThatDivOutputAbsent();
    }
}