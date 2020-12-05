package JavaCollectionsFramework;
import java.util.*;

public class Sieve
{
    public static void main (String[] args)
    {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a give maximum.");
        System.out.println();

        //Scanner class
        Scanner console = new Scanner (System.in);
        System.out.print("Maximum number: ");
        int max = console.nextInt();

        //create and print primes list
        List<Integer> primes = sieve(max);
        System.out.println("Primes number up to " + max);
        System.out.println(primes);
    }

    public static List<Integer> sieve (int max)
    {
        List<Integer> primes = new LinkedList<Integer>();

        //add all numbers from 2 to max to a list
        List<Integer> numbers = new LinkedList<Integer>();
        for (int i = 2; i < max; i ++)
        {
            numbers.add(i);
        }

        while (!numbers.isEmpty())
        {
            int front = numbers.remove(0);
            primes.add(front);
            //remove all multiples of this prime number
            Iterator<Integer> i = numbers.iterator();
            while (i.hasNext())
            {
                int current = i.next();
                if ((current % front) == 0)
                {
                    i.remove();
                }
            }
        }
        return primes;
    }
}
