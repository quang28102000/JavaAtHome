package ArrayLists;

import java.io.*;
import java.util.*;

public class Vocabulary2
{
    public static void main (String[] args)
        throws FileNotFoundException
    {
        Scanner in1 = new Scanner (new File("/home/eden-marcus/IdeaProjects/textFile/test01.txt"));
        Scanner in2 = new Scanner (new File("/home/eden-marcus/IdeaProjects/textFile/test02.txt"));

        ArrayList<String> list1 = getWords(in1);
        ArrayList<String> list2 = getWords(in2);
        ArrayList<String> common = getOverLap(list1, list2);

        System.out.println("list 1 = " + list1);
        System.out.println("list 2 = " + list2);
        System.out.println("overlap = " +common);

    }
    public static ArrayList<String> getWords (Scanner input)
    {
        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext())
        {
            String next = input.next();
            words.add(next);
        }
        Collections.sort(words);

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

    //Finding the overlap
    public static ArrayList<String> getOverLap (ArrayList<String> list1, ArrayList<String> list2)
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
}
