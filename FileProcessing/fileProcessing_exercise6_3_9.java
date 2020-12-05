import java.io.*;
import java.util.*;

public class fileProcessing_exercise6_3_9
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner(new File ("/home/eden-marcus/IdeaProjects/textFile/readme.txt"));
        int count  = 0;
        while (input.hasNextLine())
        {
            System.out.println("input: " + input.nextLine());
            count++;
        }
        System.out.println(count + " total");
    }
}
