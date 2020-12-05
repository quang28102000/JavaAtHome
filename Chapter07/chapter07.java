public class chapter07
{
    public static void main (String [] args)
    {
        int[] list  = buildOddArray(5);
        incrementAll(list);
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static int[] buildOddArray (int size)
    {
        int[] data = new int[size]; //cap phat bo nho dong
        for (int i = 0; i < size; i++)
        {
            data[i] = 2 * i + 1;
        }
        return data;
    }
    public static void incrementAll (int [] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            data[i]++;
        }
    }
}
