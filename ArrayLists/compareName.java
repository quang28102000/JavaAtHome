package ArrayLists;

import java.util.*;

public class compareName
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner (System.in);
        System.out.print("Type a name: ");
        String name1  = console.nextLine();

        System.out.print("Type a name: ");
        String name2 = console.nextLine();

        if (name1.compareTo(name2) > 0)
        {
            System.out.println(name2 + " goes before " + name1);
        }else
        {
            System.out.println(name1 + " goes before " + name2);
        }
    }
}
