import java.io.*;
import java.util.*;

public class fileProcessing_exercise6_3_12
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner console = new Scanner (System.in);

        System.out.println("Type a file name: ");
        String fileName = console.nextLine();

        Scanner input = new Scanner (new File (fileName));
        while (input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }
}
