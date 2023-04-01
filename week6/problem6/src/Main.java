import com.sun.javafx.binding.Logging;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application {
    final static public int MAX_X = 300, MAX_Y = 300, MIN_X = 0, MIN_Y = 0;
    public static void main(String[] args) {
        launch(args);
    }

    public Group drawRecTreeWrapper(int k) {
        Group group = new Group();

        drawRecTree(0,0,
                            300, 0,
                            0, 300,
                            300, 300,
                            0, k,
                            group);

        return group;
    }
    public void drawRecTree(  int topLeftX, int topLeftY,
                              int topRightX, int topRightY,
                              int botLeftX, int botLeftY,
                              int botRightX, int botRightY,
                              int i, int k,
                              Group group) {
        int startX = 0, startY = 0;
        int endX = 0, endY = 0;

        if (i >= k) {
            return;
        }

        if (i == 0) {
            startX = topRightX / 2;
            startY = botRightY;
            endX = topRightX / 2;
            endY = botRightY / 2;
            Line line = new Line(startX, startY, endX, endY);
            line.setStroke(Color.BLACK);
            group.getChildren().add(line);
        }

        startX = endX;
        startY = endY;


    }

    @Override
    public void start(Stage stage) throws Exception {
        int k = 2;

        Group group = drawRecTreeWrapper(k);
        Scene scene = new Scene(group, MAX_X, MAX_Y);

        stage.setTitle("Recursive tree");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();
    }
}