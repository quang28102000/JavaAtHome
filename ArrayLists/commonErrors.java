package ArrayLists;

import java.util.ArrayList;

public class commonErrors
{
    public static void main (String[] args)
    {
        int n = 128;
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(n);
        number.add(n);
        if (number.get(0) == number.get(1))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("unequal");
        }
    }
}
