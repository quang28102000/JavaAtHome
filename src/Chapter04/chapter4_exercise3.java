import java.util.Scanner;

public class chapter4_exercise3
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print ("a = ");
        int a1 = console.nextInt();
        System.out.print ("b = ");
        int b1 = console.nextInt();
        //ifElseMystery(a1,b1);
        ifElseMystery2(a1,b1);
    }
    public static void ifElseMystery (int x, int y)
    {
        int z = 4;
        if (z <= x)
        {
            z = x + 1;
        }
        else
        {
            z = z +9;
        }
        if (z <= y)
        {
            y++;
        }
        System.out.println (z + " " + y);
    }
    public static void ifElseMystery2 (int a, int b)
    {
        if (a * 2 < b)
        {
            a = a * 3;
        }
        else if (a > b)
        {
            b = b + 3;
        }
        if (b < a)
        {
            b++;
        }
        else
        {
            a--;
        }
        System.out.println (a + " " + b);
    }
}
