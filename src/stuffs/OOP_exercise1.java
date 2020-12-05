import java.util.*;

public class OOP_exercise1
{
    public static void main (String [] args)
    {
        OOP_exercise1 object1 = new OOP_exercise1();
        OOP_exercise1.max (30, 2,76);
    }
    public static void max (int a, int b, int c)
    {
        int max = a;
        if (max < b)
        {
            max = b;
        }
        if (max < c)
        {
            max = c;
        }
        System.out.print ("Max = " + max);
    }
}
