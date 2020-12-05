public class chapter07_04
{
    public static void main(String[] args)
    {
        int[] arr = {11, 20, 8, 11, 7, 29};
        swapPairs(arr);
    }
    public static void swapPairs (int[] data)
    {
        for (int i = 0; i < data.length; i+=2)
        {
            swap(data, i, i + 1);
        }
        for (int i = 0; i < data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
    }
    public static void swap (int[] data, int i, int j)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
