package ArrayLists;

import java.util.*;
import java.io.*;

public class Vocabulary1
{
    public static void main (String[] args)
        throws FileNotFoundException
    {
        Scanner in1 = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/test01.txt"));
        Scanner in2 = new Scanner (new File ("/home/eden-marcus/IdeaProjects/textFile/test02.txt"));

        ArrayList<String> list1 = getWords(in1);
        ArrayList<String> list2 = getWords(in2);

        System.out.println("list 1 = " + list1);
        System.out.println("list 2 = " + list2);
    }

    public static ArrayList<String> getWords (Scanner input)
    {
        //lay tat ca nhung tu va sap xep
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext())
        {
            String next = input.next();
            words.add(next);
        }
        Collections.sort(words);

        //Add new words to new list and return
        ArrayList<String> result = new ArrayList<String>();
        if (words.size() > 0)
        {
            //add tu dau tien vao trong danh sach
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
}
