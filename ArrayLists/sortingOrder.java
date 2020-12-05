package ArrayLists;
import java.util.*;

public class sortingOrder
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner (System.in);
        System.out.print("Type a message to sort: ");
        String message = console.nextLine();

        Scanner lineScan = new Scanner(message);
        ArrayList<String> words = new ArrayList<String>();
        while (lineScan.hasNext())
        {
            words.add(lineScan.next());
        }

        System.out.print("Your message sorted: ");

        Collections.sort(words);
        for (String s : words)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
