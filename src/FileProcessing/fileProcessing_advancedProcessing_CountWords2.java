import java.io.*;
import java.util.*;

public class fileProcessing_advancedProcessing_CountWords2
{
    public static void main (String []args)
        throws FileNotFoundException
    {
       Scanner console = new Scanner (System.in);
       Scanner input = getInput(console);

       int count = 0;
       while (input.hasNext())
       {
           String word = input.next();
           count++;
       }
       System.out.println("Total words = " + count);
    }

    public static Scanner getInput (Scanner console)
        throws FileNotFoundException
    {
        System.out.println("Input file name?");
        File f = new File (console.nextLine());
        while (!f.canRead())
        {
            System.out.println("File not found. Try Again!");
            System.out.println("Input file name?");
            f = new File (console.nextLine());
        }
        return new Scanner(f);
    }

}
