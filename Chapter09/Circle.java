package Chapter09;

import java.awt.*;

public class Circle implements Shape
{
    private Point center;
    private double radius;

/*    public Circle (Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }*/

    public Circle (double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return (Math.PI * Math.pow(radius,2));
    }

    public double getPerimeter()
    {
        return (2.0 * radius * Math.PI);
    }
}
