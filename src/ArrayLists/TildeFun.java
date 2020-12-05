package ArrayLists;

import java.util.ArrayList;

public class TildeFun
{
    public static void main (String[] args)
    {
        //construct and fill up ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("scores");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        //insert one tilde in front of each word
        for (int i = 0; i < words.size(); i+=2)
        {
            words.add(i, "~");
        }
        //for (int i = words.size(); i >=0; i--_
        System.out.println("after loop words = " + words);
        System.out.println(words.size() + "");
        //remove tildes
       /* for (int i = 0; i < words.size(); i++)
        {
            words.remove(i);
        }*/
        for (int i = words.size() - 2; i >=0; i-=2)
        {
            words.remove(i);
        }
        System.out.print("after second loop words = " + words);
    }
}
