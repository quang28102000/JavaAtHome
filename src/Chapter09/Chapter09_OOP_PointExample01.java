import java.awt.*;

public class Chapter09_OOP_PointExample01
{
    public static void main (String []args)
    {
        Point p = new Point(3, 8);
        System.out.println("Initially p = " + p);
        p.translate(-1, -2);
        System.out.println("After translating p = " + p);
    }
}
