package lab2;

import org.w3c.dom.css.Rect;

public class Rectangle {
    public Rectangle() {
        // calling the constructor with 2 double parameters :)
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
        this.color = "yellow";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1.0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0;
        }
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        if (color != null) {
            // not "this" because static
            Rectangle.color = color;
        } else {
            Rectangle.color = "yellow";
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2.0;
    }

    // data:
    private double width;
    private double height;
    private static String color;
}
