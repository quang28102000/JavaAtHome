import java.util.Arrays;

public class chapter07_07
{
    public static void main (String[] args)
    {
        String[] arr = {"alpha","beta","gamma","delta","gamma","beta","alpha"};
        if (palindrome(arr) == true)
        {
            System.out.print("the array is palindrome");
        }
        else
        {
            System.out.print("The array is NOT palindrome");
        }
    }
    public static boolean palindrome (String[] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (!data[i].equals(data[data.length - 1 - i]))
            {
                return false;
            }
        }
        return true;
    }
}
