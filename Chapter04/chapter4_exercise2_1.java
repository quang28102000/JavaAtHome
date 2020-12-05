import java.util.*;
public class chapter4_exercise2_1
{
    public static void main (String [] args)
    {
        System.out.println ("This program adds a sequence of");
        System.out.println ("numbers.");
        System.out.println ();

        Scanner console = new Scanner (System.in);

        System.out.print ("How many numbers do you have? ");
        int totalNumber = console.nextInt ();

        int negative = 0;
        double sum = 0.0;
        for (int i = 1; i <= totalNumber; i++)
        {
            System.out.print (" #" + i + "? ");
            double next = console.nextDouble ();
            sum += next;
            if (next < 0)
            {
                negative ++;
            }
        }
        System.out.println ();

        if (totalNumber <= 0)
        {
            System.out.println ("NO numbers to average");
        }
        else
        {
            double average = sum / totalNumber;
            System.out.println ("average = " + average);
        }

        System.out.println ("sum = " + sum);
        System.out.println("# of negative " + negative);
    }
}
