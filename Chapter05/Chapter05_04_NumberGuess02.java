import java.util.*;

public class Chapter05_04_NumberGuess02
{
    public static void main (String [] args)
    {
        System.out.println("Tru to guess my two digits");
        System.out.println("number, and I will tell you how");
        System.out.println("many digits from your guess");
        System.out.println("appear in my number");
        System.out.println();

        Scanner console = new Scanner(System.in);
        //create random object
        Random rand = new Random();
        int number = rand.nextInt(100);

        // first guess
        System.out.print("Your guess? ");
        int guess = console.nextInt();
        int numGuess = 1;

        //give hints until correct guess is matched
        while (guess != number)
        {
            //the matched number
            int numMatches = matches(number, guess);
            System.out.println("Wrong number (hint: " + numMatches + " digits match)");
            System.out.print("Your guess? ");
            guess = console.nextInt();
            numGuess++;
        }
        System.out.println();
        System.out.println("You got it rights in " + numGuess + " tries.");
    }
    public static int matches (int number, int guess)
    {
        int numMatches = 0;
        //check the first digit
        if (guess / 10 == number / 10 || guess / 10 == number % 10)
        {
            numMatches++;
        }
        //check the second digit
        if (guess / 10 != guess % 10 && (guess % 10 == number / 10 || guess % 10 == number % 10) )
        {
            numMatches++;
        }
        return  numMatches;
    }
}
