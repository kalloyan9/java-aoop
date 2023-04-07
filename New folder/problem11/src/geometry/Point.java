package geometry;

public class Point {
    // data members
    private double coords[];

    public double[] getCoords() {
        double coords[] = new double[this.coords.length];
        for (int i = 0; i < this.coords.length; ++i) {
            coords[i] = this.coords[i];
        }
        return coords;
    }

    public void setCoords(double[] coords) {
        if (coords != null && coords.length == 2) {
            for (int i = 0; i < coords.length; ++i) {
                if (coords[i] < 0.0) {
                    coords[i] = 0.0;
                }
                this.coords[i] = coords[i];
            }
        }
    }

    public Point(double coords[]) {
        this.coords = new double[2];
        this.coords[0] = coords[0];
        this.coords[1] = coords[1];
    }

    public Point() {
        this(new double[] {0, 0});
    }

    public Point(Point other) {
        this(other.getCoords()); // coping
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", coords[0], coords[1]);
    }
}
