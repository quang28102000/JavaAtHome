import java.io.*;
import java.util.*;

public class fileProcessing01
{
    public static void main (String []args)
    /*throws FileNotFoundException
    {
        Scanner input = new Scanner (new File("/home/eden-marcus/IdeaProjects/Java At Home/src/name.txt"));
        int count = 0;
        while (input.hasNext())
        {
            String word = input.next();
            count++;
        }
        System.out.println("total words = " + count);
    }*/
    {
        File f = new File ("/home/eden-marcus/IdeaProjects/Java At Home/src/name.txt");
        System.out.println("Exists returns " + f.exists());
        System.out.println("Can read returns " + f.canRead());
        System.out.println("Length returns " + f.length());
        System.out.println("getAbsolutePath returns " + f.getName());
    }
}
