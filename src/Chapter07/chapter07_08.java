public class chapter07_08
{
    public static void main (String[] args)
    {
        double[][] grid  = new double[3][4];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
        }
        System.out.println();
    }
}
