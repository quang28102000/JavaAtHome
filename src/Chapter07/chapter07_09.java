public class chapter07_09
{
    public static void main (String[] args)
    {
        int[][] arr = new int[5][];
        triangle(arr);
        print(arr);
    }
    public static void triangle (int[][] data)
    {
        int value = 1;
        for (int i = 0; i < 5; i++)
        {
            data[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++ )
            {
                data[i][j] = value;
                value++;
            }
        }
    }
    public static void print (int[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
