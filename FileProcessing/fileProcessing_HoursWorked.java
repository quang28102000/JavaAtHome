import java.io.*;
import java.util.*;
public class fileProcessing_HoursWorked
{
    public static void main (String []args)
        throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/hours.dat"));
        process(input);
    }
    public static void process (Scanner input)
    {
        while (input.hasNext()) //Co ki tu phia sau hay khong
        {
            String name = input.next(); //tra ve cac ki tu kieu String

            double sum = 0.0;
            while (input.hasNextDouble()) //co double phia sau hay khong
            {
                sum += input.nextDouble(); //tra ve cac so co kieu double
            }
            System.out.println("Total hours worked by " + name + " = " + Math.round(sum * 100.0) / 100.0);
        }
    }
}
