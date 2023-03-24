/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnBinary"
    private Button btnBinary; // Value injected by FXMLLoader

    @FXML // fx:id="btnDecimal"
    private Button btnDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="btnHex"
    private Button btnHex; // Value injected by FXMLLoader

    @FXML // fx:id="mniBinary"
    private MenuItem mniBinary; // Value injected by FXMLLoader

    @FXML // fx:id="mniDecimal"
    private MenuItem mniDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="mniHex"
    private MenuItem mniHex; // Value injected by FXMLLoader

    @FXML // fx:id="mniQuit"
    private MenuItem mniQuit; // Value injected by FXMLLoader

    @FXML // fx:id="txtBinary"
    private TextField txtBinary; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecimal"
    private TextField txtDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtHex"
    private TextField txtHex; // Value injected by FXMLLoader

    @FXML
    void btnBinaryOnAction(ActionEvent event) {

    }

    @FXML
    void btnDecimalOnAction(ActionEvent event) {

    }

    @FXML
    void btnHexOnAction(ActionEvent event) {

    }

    @FXML
    void mniBinaryOnAction(ActionEvent event) {

    }

    @FXML
    void mniDecimalOnAction(ActionEvent event) {

    }

    @FXML
    void mniHexOnAction(ActionEvent event) {

    }

    @FXML
    void mniQuitOnAction(ActionEvent event) {

    }

    @FXML
    void txtBinaryOnAction(ActionEvent event) {
        // todo: add action
    }

    @FXML
    void txtDecimalOnAction(ActionEvent event) {
        String text = txtDecimal.getText();
        int number = Integer.parseInt(text);
        String hexText = Integer.toHexString(number).toUpperCase();
        String binaryText = Integer.toBinaryString(number);
        txtHex.setText(hexText);
        txtBinary.setText(binaryText);
    }

    @FXML
    void txtHexOnAction(ActionEvent event) {
        // todo: add action
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnBinary != null : "fx:id=\"btnBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDecimal != null : "fx:id=\"btnDecimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnHex != null : "fx:id=\"btnHex\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniBinary != null : "fx:id=\"mniBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniDecimal != null : "fx:id=\"mniDecimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniHex != null : "fx:id=\"mniHex\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniQuit != null : "fx:id=\"mniQuit\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtBinary != null : "fx:id=\"txtBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtDecimal != null : "fx:id=\"txtDecimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtHex != null : "fx:id=\"txtHex\" was not injected: check your FXML file 'sample.fxml'.";

    }

}
