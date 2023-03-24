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

public class Geometry extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        // TODO Type JavaFX code for drawing objects
        double width = scene.getWidth();
        double height = scene.getHeight();
        double centreX = width / 2;
        double centreY = height / 2;
        double radius = Math.min(width, height) / 3;

        Circle circle = new Circle(centreX, centreY, radius);
        circle.setStroke(Color.RED);
        circle.setFill(null);
        group.getChildren().add(circle);

        TextInputDialog tid = new TextInputDialog();
        tid.setTitle("Input dialog for x");
        tid.setHeaderText("Enter x < " + width);
        tid.setContentText("Input x: ");
        double x = Double.parseDouble(tid.showAndWait().get());
        double y;
        Line line = new Line(x, 0, x, height);
        line.setStroke(Color.BLUE);

        double a = Math.abs(x - width / 2);
        double b = radius * radius - a * a; // b^2

        if (b > 0) { // 2 points
            y = height / 2 - Math.sqrt(b);
            Circle circleInt = new Circle(x, y, 3);
            Text text = new Text(x, y, String.format("[%.2f; %.2f]", x, y));
            group.getChildren().addAll(circleInt, line, text);

            y = height / 2 + Math.sqrt(b);
            circleInt = new Circle(x, y, 3);
            text = new Text(x, y, String.format("[%.2f; %.2f]", x, y));
            group.getChildren().addAll(circleInt, line, text);
        } else if (b == 0) { // 1 point
            y = height / 2;
            Circle circleInt = new Circle(x, y, 3);
            group.getChildren().add(circleInt);
            group.getChildren().add(line);
        } else { // 0 points
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error intersections");
            alert.setContentText("No points");
            alert.showAndWait();
        }

        stage.setTitle("Drawing scene");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();

    }
}