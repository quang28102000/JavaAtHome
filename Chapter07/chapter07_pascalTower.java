public class chapter07_pascalTower {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        pascalTriangle(arr);
        print(arr);
    }

    public static void pascalTriangle(int[][] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            data[i] = new int[i + 1];
            data[i][0] = 1;
            data[i][i] = 1;
            for (int j = 1; j < i; j++) //j<i vi j la index so nam giua
            {
                data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
            }
        }
    }

    public static void print(int[][] data)
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