import java.util.Scanner;

public class chapter4_exercise5
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner (System.in);
        System.out.print ("Type a number: ");
        int n = console.nextInt ();
        if (n % 2 == 0)
        {
            if (n % 3 == 0)
            {
                System.out.println ("Divisible by 6");
            }
        }
        else
        {
            System.out.println ("Odd");
        }
    }
}
