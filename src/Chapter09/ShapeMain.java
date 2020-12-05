package Chapter09;

public class ShapeMain
{
    public static void main (String[] args)
    {
        /*Shape[] shapes = {new Circle(2), new Rectangle(5,4), new Triangle(3,4,5)};
        for (Shape shape : shapes)
        {
            System.out.println("areas: " + shape.getArea());
            System.out.println("perimeter: " + shape.getPerimeter());
        }*/
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(18,18);
        shapes[1] = new Triangle(30,30,30);
        shapes[2] = new Circle(12);
        for (int i = 0; i < shapes.length; ++i)
        {
            System.out.println("areas: " + shapes[i].getArea());
            System.out.println("perimeter: " + shapes[i].getPerimeter());
        }
    }
}
