import java.io.*;
import java.util.*;

public class fileProcessing_advancedProcessing_02
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/words.txt"));

        PrintStream output = new PrintStream (new File ("/home/eden-marcus/IdeaProjects/textFile/words2.txt"));

        while (input.hasNextLine())
        {
            String text = input.nextLine();
            echoFixed(text, output);
            echoFixed(text,System.out);
        }

    }
    public static void echoFixed (String text, PrintStream output)
    {
       Scanner data = new Scanner (text);

       if (data.hasNext())
       {
           output.print(data.next());
           while (data.hasNext())
           {
               output.print(" " + data.next());
           }
       }
       output.println();
/*
       output.print(" ");
*/
    }
}
