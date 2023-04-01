/**
 * Sample Skeleton for 'email.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class EmailController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtBccField"
    private TextField txtBccField; // Value injected by FXMLLoader

    @FXML // fx:id="txtCcField"
    private TextField txtCcField; // Value injected by FXMLLoader

    @FXML // fx:id="txtMessageBodyField"
    private TextArea txtMessageBodyField; // Value injected by FXMLLoader

    @FXML // fx:id="txtSubjectField"
    private TextField txtSubjectField; // Value injected by FXMLLoader

    @FXML // fx:id="txtToField"
    private TextField txtToField; // Value injected by FXMLLoader

    @FXML
    public void sendButtonClicked(ActionEvent event) {
        String to = txtToField.getText();
        String cc = txtCcField.getText();
        String bcc = txtBccField.getText();
        String subject = txtSubjectField.getText();
        String messageBody = txtMessageBodyField.getText();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Email Message");
        alert.setHeaderText(null);
        alert.setContentText("To: " + to + "\nCC: " + cc + "\nBcc: " + bcc + "\nSubject: " + subject + "\nMessage Body: " + messageBody);
        alert.showAndWait();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtBccField != null : "fx:id=\"txtBccField\" was not injected: check your FXML file 'email.fxml'.";
        assert txtCcField != null : "fx:id=\"txtCcField\" was not injected: check your FXML file 'email.fxml'.";
        assert txtMessageBodyField != null : "fx:id=\"txtMessageBodyField\" was not injected: check your FXML file 'email.fxml'.";
        assert txtSubjectField != null : "fx:id=\"txtSubjectField\" was not injected: check your FXML file 'email.fxml'.";
        assert txtToField != null : "fx:id=\"txtToField\" was not injected: check your FXML file 'email.fxml'.";

    }

}

