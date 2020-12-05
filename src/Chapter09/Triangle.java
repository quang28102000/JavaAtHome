package Chapter09;

public class Triangle implements Shape
{
    private double a;
    private double b;
    private double c;

    public Triangle (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea()
    {
        double s = (a + b + c) / 2;
        return (Math.sqrt(s * (s - 1) * (s - b) * (s - c)));
    }

    public double getPerimeter()
    {
        return (a + b + c);
    }
}
