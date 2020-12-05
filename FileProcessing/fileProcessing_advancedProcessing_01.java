import java.io.*;
import java.io.*;

public class fileProcessing_advancedProcessing_01
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        PrintStream output = new PrintStream(new File ("/home/eden-marcus/IdeaProjects/textFile/hello.txt"));
        output.println("Hello, World!");
        output.println();
    }
}
