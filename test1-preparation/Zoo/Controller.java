/**
 * Sample Skeleton for 'zoo.fxml' Controller Class
 */
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import libs.src.*;
public class Controller {
    // data members
    private AnimalInstance[] samples;
    private Animal[] animals;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnDistributionsByRegions"
    private Button btnDistributionsByRegions; // Value injected by FXMLLoader

    @FXML // fx:id="btnQuit"
    private Button btnQuit; // Value injected by FXMLLoader

    @FXML // fx:id="btnShowAllSortedByAge"
    private Button btnShowAllSortedByAge; // Value injected by FXMLLoader

    @FXML // fx:id="btnShowEndangaredByAnimalType"
    private Button btnShowEndangaredByAnimalType; // Value injected by FXMLLoader

    @FXML // fx:id="btnShuffleSamples"
    private Button btnShuffleSamples; // Value injected by FXMLLoader

    @FXML
    void btnDistributionsByRegionsOnAction(ActionEvent event) {

    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {

    }

    @FXML
    void btnShowAllSortedByAgeOnAction(ActionEvent event) {

    }

    @FXML
    void btnShowEndangaredByAnimalTypeOnAction(ActionEvent event) {

    }

    @FXML
    void btnShuffleSamplesOnAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnDistributionsByRegions != null : "fx:id=\"btnDistributionsByRegions\" was not injected: check your FXML file 'zoo.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'zoo.fxml'.";
        assert btnShowAllSortedByAge != null : "fx:id=\"btnShowAllSortedByAge\" was not injected: check your FXML file 'zoo.fxml'.";
        assert btnShowEndangaredByAnimalType != null : "fx:id=\"btnShowEndangaredByAnimalType\" was not injected: check your FXML file 'zoo.fxml'.";
        assert btnShuffleSamples != null : "fx:id=\"btnShuffleSamples\" was not injected: check your FXML file 'zoo.fxml'.";
        animals = new Animal[6];
        animals[0]{"Тигър", AnimalType.MAMMAL, true, "Asia", true};
        animals[1]{"Фламинго", AnimalType.BIRD, false, "Africa", true};
        animals[2]{"Гущер", AnimalType.REPTILE, true, "Australia", true};
        animals[3]{"Пъстърва", AnimalType.FISH, false, "Europe", false};
        animals[4]{"Делфин", AnimalType.MAMMAL, false, "Australia", true};
        animals[5]{"Вълк", AnimalType.MAMMAL, true, "America", false};

    }

}
