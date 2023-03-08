package lab2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Area: " + rectangle.getArea());
        rectangle.setWidth(-3);
        rectangle.setHeight(5);

        // rectangle because we are calling function of an instance.
        System.out.println("P: " + rectangle.getPerimeter());
        System.out.println("S: " + rectangle.getArea());
        // not rectangle because we are calling a static function for the whole class.
        System.out.println("Color: " + Rectangle.getColor());
    }
}
