import java.util.*;
public class Chapter05_04_NbumerGuess
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner (System.in);
        int number = 42;

        System.out.print("Your guess? ");
        int guess = console.nextInt();

        int count = 1;
        while (guess != number)
        {
            System.out.println("Wrong Number!");
            System.out.print ("Your guess? ");
            guess = console.nextInt();
            count++;
        }
        System.out.println("You got it right in " + count + " tries.");
   }
}
