package com.geometry.types;

import java.util.Comparator;

public class Point  implements Comparable {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point () {
        setX(0);
        setY(0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = (x >= 0) ? x : 0;
    }

    public void setY(int y) {
        this.y = (y >= 0) ? y : 0;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        } else if (!(o instanceof Point)) {
            return 1;
        } else {
            Point other = (Point) o;
            if (this.x > other.x) {
                return 1;
            } else {
                return this.y - other.y;
            }
        }
    }
}
