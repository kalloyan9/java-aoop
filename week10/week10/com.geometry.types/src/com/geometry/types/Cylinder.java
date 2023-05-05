package com.geometry.types;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int x, int y, int radius, int height) {
        super(x, y, radius);
        setHeight(height);
    }

    public Cylinder() {
        super(0, 0, 1);
        setHeight(1);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 1) {
            height = 1;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder with base %s and heigh %d",
                super.toString() +
                height);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        } else if (!(o instanceof Cylinder)) {
            return 1;
        } else {
            Cylinder other = (Cylinder) o;
            int larger = super.compareTo((Circle) other);
            if (larger == 0) {
                return this.height - other.height;
            } else {
                return larger;
            }
        }
    }
}
