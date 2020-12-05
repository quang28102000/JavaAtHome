import java.io.*;
import java.util.*;

public class fileProcessing_StringScannerExample
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/hours2.dat"));
        while (input.hasNextLine())
        {
            String text = input.nextLine();
            processLine(text);
        }
    }
    public static void processLine (String text)
    {
        Scanner input = new Scanner (text);
        int id = input.nextInt();
        String name = input.next();

        double sum = 0.0;
        while (input.hasNextDouble())
        {
            sum += input.nextDouble();
        }
        System.out.println("Total hours worked by " + name + " (id#" + id + ") = " + sum);
    }
}
