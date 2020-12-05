import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class fileProcessing_ShowSum03
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/numbers.dat"));
        processToken(input, 2);
/*
        processToken(input, 3);
*/
        processToken(input, 2);
    }
    public static void processToken (Scanner input, int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {
            double next = input.nextDouble();
            System.out.println("Number " + i + " = " + input.next());
            sum += next;
        }
        System.out.println("Sum = " + Math.round(sum * 100.0) / 100.0);
    }
}
