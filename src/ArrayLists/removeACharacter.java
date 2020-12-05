package ArrayLists;
import java.util.*;

import java.util.ArrayList;

public class removeACharacter
{
    public static void main (String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("It");
        words.add("was");
        words.add("a");
        words.add("dark");
        words.add("and");
        words.add("stormy");
        words.add("night");
        System.out.println(maxLength(words) + " ");
        System.out.println(words.indexOf("dark"));
        System.out.println(words.indexOf("stormy"));
/*        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).indexOf("a") >= 0)
            {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words + " ");*/
    }
    public static int maxLength (ArrayList<String> list)
    {
        int max = 0;
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.length() > max)
            {
                max = s.length();
            }
        }
        return max;
    }

}
