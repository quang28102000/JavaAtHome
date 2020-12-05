package ArrayLists;
import java.io.*;
import java.util.*;

public class stopWords
{
    public static void main (String[] args)
        throws FileNotFoundException
    {
        ArrayList<String> stopWords = new ArrayList<>();
        stopWords.add("a");
        stopWords.add("be");
        stopWords.add("by");
        stopWords.add("how");
        stopWords.add("in");
        stopWords.add("is");
        stopWords.add("it");
        stopWords.add("of");
        stopWords.add("on");
        stopWords.add("or");
        stopWords.add("that");
        stopWords.add("the");
        stopWords.add("this");
        stopWords.add("to");
        stopWords.add("why");

        //process the file, printing all but stopWords
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/speech.txt"));
        while (input.hasNext())
        {
            String next = input.next();
            if (!stopWords.contains(next.toLowerCase()))
            {
                System.out.print(next + " ");
            }
        }
    }
}
