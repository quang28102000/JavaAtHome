import java.io.*;
import java.util.*;

public class fileProcessing_EchoUppercase
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/poem.txt"));
        while (input.hasNextLine())
        {
            String text = input.nextLine();
            System.out.println(text.toUpperCase());
        }
    }
}
