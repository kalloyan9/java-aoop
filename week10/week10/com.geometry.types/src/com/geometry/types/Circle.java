package com.geometry.types;

public class Circle extends Point{
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public Circle() {
        this(0, 0, 1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            radius = 1;
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with centre %s and radius %d",
                super.toString(), radius);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        } else if (!(o instanceof Circle)) {
            return 1;
        } else {
            Circle other = (Circle) o;
            int larger = super.compareTo((Point) other);
            if (larger == 0) {
                return this.radius - other.radius;
            } else {
                return larger;
            }
        }
    }
}
