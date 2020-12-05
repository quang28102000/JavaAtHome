import java.io.*;
import  java.util.*;

public class fileProcessing_exercise6_3_11
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/poem.txt"));
        while (input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }

}
