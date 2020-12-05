import java.util.*;

public class OOP_exercise5
{
    public static void main (String [] args)
    {
        OOP_exercise5 object1 = new OOP_exercise5();
        object1.cost (20, 24);
    }
    public static void cost (int a, int b)
    {
        int sum = 0;
        if (b > 0 && b < 18)
        {
            sum = (b - a) * 45000;

        }
         else if (b >= 18 && b <= 24)
        {
            sum = (b - a) * 60000;
        }
        else
        {
            System.out.print ("Please import the timing again!");
        }
        System.out.print ("The cost need to be calculated: " + sum);
    }
}
