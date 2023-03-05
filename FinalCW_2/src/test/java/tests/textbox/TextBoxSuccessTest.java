package tests.textbox;

import org.testng.annotations.Test;
import steps.textbox.TextBoxSuccessSteps;

public class TextBoxSuccessTest extends TextBoxTest {

        @Test(dataProvider = "textBoxSuccess")
        public void testTextBoxSuccessString (String name, String email, String currentAddress, String permanentAddress) {
            TextBoxSuccessSteps textBoxSteps1 = textBoxSteps.doTextBox(name, email, currentAddress, permanentAddress);
            textBoxSteps1.verifyThatOutputPresent();
        }
}
