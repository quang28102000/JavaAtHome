import java.util.*;

public class OOP_progressTest01
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print ("Nhap mot chuoi ki tu bat ky: ");
        String s = console. nextLine();

        //func1
        System.out.print ("In hoa ky tu dau tien cua tu: " + func1(s));
        System.out.println();
        //func2
        func2(s);
        System.out.println();
        //func3
        func3(s);
        System.out.println();
        //func4
        func4(s);
    }
    public static String func1 (String s1)
    {

        char[] chars = s1.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++)
        {
            if (!found && Character.isLetter(chars[i]))
            {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            }
            else if (Character.isWhitespace(chars[i]))
            {
                found = false;
            }
        }
        return String.valueOf(chars);
    }
    public static void func2 (String s2)
    {
        int vowelCount = 0;
        for (int i = 0; i < s2.length(); i++)
        {
            switch (s2.charAt(i))
            {
                case 'u':
                case 'e':
                case 'o':
                case 'a':
                case 'i':
                case 'U':
                case 'E':
                case 'O':
                case 'A':
                case 'I':
                    vowelCount++;
                    break;
                default:
            }
        }
        System.out.println();
        System.out.println("So nguyen am la: " + vowelCount);
    }
    public static void func3 (String s3)
    {
        int i = 0, count = 1;
        char[] s1 = s3.toCharArray();

        while(s1[i] == ' ')
        {
            i++;
        }

        for (int j = i; j < s1.length - 1; j++)
        {
            if(s1[j] == ' ' && s1[j + 1] != ' ')
            {
                count++;
            }
        }
        System.out.println("So tu co trong chuoi da cho: " + count);
    }
    public static void func4 (String s4)
    {
        Map < String, Integer > map = new HashMap < > ();
        String[] tokens = s4.split(" ");

        for (String token: tokens)
        {
            String word = token. toLowerCase();
            if (map.containsKey(word))
            {
                int count = map.get (word);
                map.put(word, count + 1);
            }
            else
            {
                map.put (word, 1);
            }
        }
        Set <String> keys = map. keySet();
        TreeSet <String> sortedKeys = new TreeSet <> (keys);
        for (String str: sortedKeys)
        {
            System.out.println("Tu " + str + " da xuat hien " + map.get(str) + " lan");
        }
    }
}
