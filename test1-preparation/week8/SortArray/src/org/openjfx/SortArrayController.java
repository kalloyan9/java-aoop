/**
 * Sample Skeleton for 'sortArrayScene.fxml' Controller Class
 */

package org.openjfx;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SortArrayController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnQuit"
    private Button btnQuit; // Value injected by FXMLLoader

    @FXML // fx:id="btnSort"
    private Button btnSort; // Value injected by FXMLLoader

    @FXML // fx:id="lblAscending"
    private Label lblAscending; // Value injected by FXMLLoader

    @FXML // fx:id="lblSorted"
    private Label lblSorted; // Value injected by FXMLLoader

    @FXML // fx:id="lblUnsorted"
    private Label lblUnsorted; // Value injected by FXMLLoader

    @FXML // fx:id="txaSorted"
    private TextArea txaSorted; // Value injected by FXMLLoader

    @FXML // fx:id="txaUnsorted"
    private TextArea txaUnsorted; // Value injected by FXMLLoader

    @FXML // fx:id="txtOrdered"
    private TextField txtOrdered; // Value injected by FXMLLoader

    @FXML
    void btnQuitOnnClick(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnSortOnnClick(ActionEvent event) {
        String unsorted = txaUnsorted.getText();
        String[] unsortedArrayS = unsorted.split("\\s+");
        int[] unsortedArrayI = new int[unsortedArrayS.length];

        for (int i = 0; i < unsortedArrayI.length; ++i) {
            unsortedArrayI[i] = Integer.parseInt(unsortedArrayS[i]);
        }

        boolean ascending = (txtOrdered.getText().equals("Y") || txtOrdered.getText().equals("y")) ? true : false;
        int[] sorted = new int[unsortedArrayI.length];
        for (int i = 0; i < unsortedArrayI.length; ++i) {
            sorted[i] = unsortedArrayI[i];
        }

        // selection sort
        for (int i = 0; i < sorted.length; ++i) {
            int min = sorted[i];
            int minIdx = i;
            for (int j = i + 1; j < sorted.length; ++j) {
                if (ascending) {
                    if (sorted[j] < min) {
                        min = sorted[j];
                        minIdx = j;
                    }
                } else {
                    if (sorted[j] > min) {
                        min = sorted[j];
                        minIdx = j;
                    }
                }
            }

            int temp = sorted[i];
            sorted[i] = min;
            sorted[minIdx] = temp;
        }

        txaSorted.setText(Arrays.toString(sorted));
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert btnSort != null : "fx:id=\"btnSort\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert lblAscending != null : "fx:id=\"lblAscending\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert lblSorted != null : "fx:id=\"lblSorted\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert lblUnsorted != null : "fx:id=\"lblUnsorted\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert txaSorted != null : "fx:id=\"txaSorted\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert txaUnsorted != null : "fx:id=\"txaUnsorted\" was not injected: check your FXML file 'sortArrayScene.fxml'.";
        assert txtOrdered != null : "fx:id=\"txtOrdered\" was not injected: check your FXML file 'sortArrayScene.fxml'.";

    }

}
