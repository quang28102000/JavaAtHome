public class chapter07_05
{
    public static void main (String [] args)
    {
        int[] arr = {3, 8, 9, 7, 5};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        print(arr);
    }
    public static void print (int[] data)
    {
        for (int i = 0; i < data. length; i++)
        {
            System.out.print(data[i] + " ");
        }
    }
}
