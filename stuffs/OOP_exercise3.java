import java.util.*;

public class OOP_exercise3
{
    public static void main (String [] args)
    {
        OOP_exercise3 object1 = new OOP_exercise3 ();
        OOP_exercise3.ptbh (1, -3, 2);
    }
    public static void ptbh (int a, int b, int c)
    {
        double x;
        double x1, x2;
        if (a == 0)
        {
            x = (double) (-b) / c;
            System.out.printf ("x = %2.2f", x);
        }
        else
        {
            double delta;
            delta = Math.pow(b,2) - (4 * a * c);
            if (delta > 0)
            {
                x1 = (-b - Math.sqrt(delta) / (2 * a));
                x2 = (b - Math.sqrt(delta) / (2 * a));
                System.out.printf ("x1 = %2.2f \nx2 = %2.2f",x1, x2);
            }else if (delta == 0)
            {
                x1 = c / a;
                System.out.println ("x1 = x2 = " + x1);
            } else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

}
