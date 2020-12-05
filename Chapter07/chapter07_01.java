import java.util.Arrays;

public class chapter07_01
{
    public static void main (String [] args)
    {
        int[] list = {8,11,14,9,12,2,18};
        for (int i = 0; i < (list.length/2); i++)
        {
            int j = list.length - i - 1;
            swap(list, i, j);
        }
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }

    }
    public static void swap (int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
