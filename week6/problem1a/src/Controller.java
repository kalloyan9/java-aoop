/**
 * Sample Skeleton for 'gcdScene.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnComputeGCD"
    private Button btnComputeGCD; // Value injected by FXMLLoader

    @FXML // fx:id="btnQuit"
    private Button btnQuit; // Value injected by FXMLLoader

    @FXML // fx:id="lblA"
    private Label lblA; // Value injected by FXMLLoader

    @FXML // fx:id="lblB"
    private Label lblB; // Value injected by FXMLLoader

    @FXML // fx:id="lblGCD"
    private Label lblGCD; // Value injected by FXMLLoader

    @FXML // fx:id="txtA"
    private TextField txtA; // Value injected by FXMLLoader

    @FXML // fx:id="txtB"
    private TextField txtB; // Value injected by FXMLLoader

    @FXML // fx:id="txtGCD"
    private TextField txtGCD; // Value injected by FXMLLoader

    private int gcd(int a, int b) {
        if (b <= 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    @FXML
    void btnComputeGCDOnAction(ActionEvent event) {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());

        txtGCD.setText(String.format("%d ", gcd(a,b)));
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnComputeGCD != null : "fx:id=\"btnComputeGCD\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert lblA != null : "fx:id=\"lblA\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert lblB != null : "fx:id=\"lblB\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert lblGCD != null : "fx:id=\"lblGCD\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert txtA != null : "fx:id=\"txtA\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert txtB != null : "fx:id=\"txtB\" was not injected: check your FXML file 'gcdScene.fxml'.";
        assert txtGCD != null : "fx:id=\"txtGCD\" was not injected: check your FXML file 'gcdScene.fxml'.";

    }

}
