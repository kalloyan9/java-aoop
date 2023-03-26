import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Drawing extends Application {
    @Override
    public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        double height = scene.getHeight();
        double width = scene.getWidth();

        // init coordinates and the padding
        final double STEP = 25.0;
        double padding = STEP;
        double xStart = width - padding;
        double yStart = padding;
        double xEnd = padding;
        double yEnd = padding;

        // cycle until the centre
        while (xStart != width / 2 && yStart != height / 2 ) {
            // draw line and change coords
            Line top = new Line(xStart, yStart, xEnd, yEnd);
            top.setStroke(Color.RED);
            group.getChildren().add(top);
            xStart = padding;
            yStart = height - padding;

            // draw line and change coords
            Line left = new Line(xEnd, yEnd, xStart, yStart);
            left.setStroke(Color.RED);
            group.getChildren().add(left);
            yEnd = yStart;
            // dont skip increase the padding
            padding += STEP;
            xEnd = width - padding;

            // draw line and change coords
            Line bot = new Line(xStart, yStart, xEnd, yEnd);
            bot.setStroke(Color.RED);
            group.getChildren().add(bot);
            xStart = xEnd;
            yStart = padding;

            // draw line and change coords
            Line right = new Line(xEnd, yEnd, xStart, yStart);
            right.setStroke(Color.RED);
            group.getChildren().add(right);
            xEnd = padding;
            yEnd = yStart;
        }

        stage.setTitle("Draw square shaped spiral");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}