import java.io.*;
import java.util.*;

public class fileProcessing_ShowSum04
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner console = new Scanner (System.in);

        System.out.println("What is the file name?");
        String name = console.nextLine();

        Scanner input = new Scanner(new File(name));
        System.out.println();

        double sum = 0.0;
        int count = 0;
        while (input.hasNextDouble())
        {
            double next = input.nextDouble();
            count++;
            System.out.println("number " + count + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + Math.round(sum * 100.0)/ 100.0);

    }

}
