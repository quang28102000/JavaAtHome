package ArrayLists;
import java.util.*;
import java.io.*;

public class Vocabulary3
{
    public static void main (String[] args)
        throws FileNotFoundException
    {
        Scanner console = new Scanner (System.in);
        giveIntro();

        System.out.print("file #1 name: ");
        Scanner in1 = new Scanner (new File(console.nextLine()));
        System.out.print("file #2 name: ");
        Scanner in2 = new Scanner (new File(console.nextLine()));
        System.out.println();

        ArrayList<String> list1 = getWords(in1);
        ArrayList<String> list2 = getWords(in2);
        ArrayList<String> common = getOverlap(list1, list2);

        reportResult(list1, list2, common);
    }

    public static ArrayList<String> getWords (Scanner input)
    {
        input.useDelimiter("[^a-zA-Z']+");
        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext())
        {
            String next = input.next();
            words.add(next);
        }
        Collections.sort(words);

        //add unique words to new list and return
        ArrayList<String> result = new ArrayList<String>();

        if (words.size() > 0)
        {
            result.add(words.get(0));
            for (int i = 1; i < words.size(); i++)
            {
                if (!words.get(i).equals(words.get(i - 1)))
                {
                    result.add(words.get(i));
                }
            }
        }
        return result;
    }

    public static ArrayList<String> getOverlap (ArrayList<String> list1, ArrayList<String> list2)
    {
        ArrayList<String> result = new ArrayList<String>();
        int i1 = 0;
        int i2 = 0;
        while ((i1 < list1.size()) && (i2 <list2.size()))
        {
            int number = list1.get(i1).compareTo(list2.get(i2));
            if (number == 0)
            {
                result.add(list1.get(i1));
                i1++;
                i2++;
            }
            else if (number < 0)
            {
                i1++;
            }
            else
            {
                i2++;
            }
        }
        return result;
    }
    public static void giveIntro()
    {
        System.out.println("This program compare to text files");
        System.out.println("and reports the number of words in");
        System.out.println("common and the percent overlap");
        System.out.println();
    }

    public static void reportResult (ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> common)
    {
        System.out.println("file #1 words = " + list1.size());
        System.out.println("file #2 words = " + list2.size());
        System.out.println("common words = " + common.size());

        double pct1 = (100.0 * common.size() / list1.size());
        double pct2 = (100.0 * common.size() / list2.size());

        System.out.println("% of file 1 in overlap: " + pct1);
        System.out.println("% of file 2 in overlap: " + pct2);
    }
}
