import java.util.*;
public class Chapter05_04_NumberGuess03
{
    public static void main (String [] args)
    {
        //console la lay input tu user
        giveIntro();
        Scanner console = new Scanner (System.in);
        //pick a random
        Random rand = new Random();
        int number = rand.nextInt(100);
        //get first guess
        int guess = getGuess(console);
        int numGuesses = 1;
        while (guess != number)
        {
            int numMatches = matches(number, guess);
            System.out.println("Incorrect (hint: " + numMatches + " digits match)");
            guess = getGuess(console);
            numGuesses++;
        }
        System.out.println("You got it right in " + numGuesses + " tries");
    }
    public static void giveIntro()
    {
        System.out.println("Try to guess my two-digit");
        System.out.println("number, and I'll tell you how");
        System.out.println("many digits from your guess");
        System.out.println("appear in my number");
        System.out.println();
    }
    public static int matches (int number, int guess)
    {
        int numMatches = 0;
        // so 1
        if (guess / 10 == number / 10 || guess / 10 == number % 10)
        {
            numMatches++;
        }
        //so 2
        if ((guess % 10 == number / 10 || guess % 10 == number % 10) && guess / 10 != guess % 10)
        {
            numMatches++;
        }
        return numMatches;
    }

    //Co phai la so khong?
    public static int getInt (Scanner console, String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextInt())
        {
            console.next(); //discard the input
            System.out.println("Not an integer. Try again !!!");
            System.out.print(prompt);
        }
        return console.nextInt();
    }
    //Co trong pham vi khong?
    public static int getGuess (Scanner console)
    {
        int guess = getInt(console, "Your guess? ");
        while (guess < 0 || guess >= 100)
        {
            System.out.println("Out of range. Try Again !!!");
            guess = getInt(console, "Your guess? ");
        }
        return guess;
    }
}
