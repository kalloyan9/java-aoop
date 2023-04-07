// ctr + space for suggesting imports!
package geometry;
import javafx.scene.Group;

public class Rectangle {
    // data members
    private Point uPoint; // upper left corner coords.
    private double width;
    private double height;

    public Rectangle(Point uPoint, double width, double height) {
        setuPoint(uPoint);
        setWidth(width);
        setHeight(height);
    }

    public  Rectangle() {
        this(new Point(), 0.0, 0.0);
    }

    public Rectangle(Rectangle other) {
        this(other.getuPoint(), other.getWidth(), other.getHeight());
    }

    public Point getuPoint() {
        return new Point(uPoint); // coping because its not primitive type
    }

    public void setuPoint(Point uPoint) {
        if (uPoint != null) {
            this.uPoint = uPoint;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            width = 0.0;
        }

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            height = 0.0;
        }

        this.height = height;
    }

    public String toString() {
        return String.format("Rectangle with upper left corner %s, width: %.2f, height %2.f",
                uPoint.toString(), width, height);
    }

    public void draw(Group pane) {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(
                uPoint.getCoords()[0], uPoint.getCoords()[1],
                width, height);
        pane.getChildren().add(rectangle);
    }
}
