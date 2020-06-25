package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    public TextArea textArea;
//    @FXML
//    public Button btn = new Button();
//    @FXML
//    public Button btnEquals;
//    @FXML
//    public Button btnComma;
//    @FXML
//    public Button btnSplit;
//    @FXML
//    public Button btnPlus;
//    @FXML
//    public Button btnMinus;
//    @FXML
//    public Button btnMult;




    public void equalsButton(javafx.event.ActionEvent actionEvent) {

    }


//    public void commaButton(javafx.event.ActionEvent actionEvent) {
//    }
//
//    public void splitButton(javafx.event.ActionEvent actionEvent) {
//    }
//
//    public void plusButton(javafx.event.ActionEvent actionEvent) {
//    }
//
//    public void minusButton(javafx.event.ActionEvent actionEvent) {
//    }
//
//    public void multipleButton() {
//
//    }

    public void clickButton(javafx.event.ActionEvent actionEvent) {
        textArea.appendText(textField.getText());
        textField.clear();
        Button btn = (Button)actionEvent.getSource();
        textField.setText(btn.getText());

        }
}



