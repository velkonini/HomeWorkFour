package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    public void clickButton() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();

    }
}
