import java.io.*;
import java.util.*;

public class fileProcessing02
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/numbers.dat"));
        double sum = 0.0;
        for (int i = 1; i <= 5; i++)
        {
            double next = input.nextDouble();
            System.out.println("number " + i + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + Math.round(sum * 100.0) / 100.0);
    }
}
