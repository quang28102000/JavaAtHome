import java.io.*;
import java.util.*;

public class fileProcessing03
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/numbers.dat"));
        double sum = 0.0;
        int count = 1;
        while (input.hasNextDouble())
        {
            double next = input.nextDouble();
            System.out.println("Number " + count + " = " + next);
            count++;
            sum += next;
        }
        System.out.println("Sum = " + Math.round(sum * 100.0) / 100.0);
    }
}
