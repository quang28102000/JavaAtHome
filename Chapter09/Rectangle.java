package Chapter09;

public class Rectangle implements Shape
{
    private double width;
    private double height;

    public Rectangle (double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return (width * height);
    }
    public double getPerimeter()
    {
        return (width + height) * 2.0;
    }
}
