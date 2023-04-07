package geometry;
import javafx.scene.Group;

public class Line {
    // data members
    private Point sPoint;
    private Point ePoint;

    public Line(Point sPoint, Point ePoint) {
        setsPoint(sPoint);
        setePoint(ePoint);
    }

    public Line() {
        this(new Point(), new Point());
    }

    public Line(Line other) {
        this(other.getsPoint(), other.getePoint());
    }

    public Point getsPoint() {
        return new Point (sPoint);
    }

    public void setsPoint(Point sPoint) {
        if (sPoint != null) {
            this.sPoint = sPoint;
        }
    }

    public Point getePoint() {
        return new Point (ePoint);
    }

    public void setePoint(Point ePoint) {
        if (ePoint != null) {
            this.ePoint = ePoint;
        }
    }

    public String toString() {
        return String.format("Line with starting point %s, with ending point: %s",
                sPoint.toString(), ePoint.toString());
    }

    public void draw(Group pane) {
        javafx.scene.shape.Line line = new javafx.scene.shape.Line(
                sPoint.getCoords()[0], sPoint.getCoords()[1],
                ePoint.getCoords()[0], ePoint.getCoords()[1]);
        pane.getChildren().add(line);
    }
}
