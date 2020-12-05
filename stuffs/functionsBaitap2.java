import java.util.Scanner;

public class functionsBaitap2
{
    Scanner console = new Scanner(System.in);
    public int [][] input ()
    {
        System.out.print("So dong cua ma tran: ");
        int a = console.nextInt();
        System.out.print("So cot cua ma tran");
        int b = console.nextInt();

        int [] [] arr = new int [a] [b];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr [i] [j] = console.nextInt();
            }
        }
    return arr;
    }
    public int multiply (int [][] arr)
    {
        int count = 0;
        int multi = 1;

        for (int i = 0; i < arr. length; i++)
        {
            if ((arr [i][0] % 3) == 0)
            {
                multi *= arr [i][0];
                count++;
            }else if (count == 0)
            {
                return 0;
            }
        }
        return multi;
    }
    public int [] max (int [][] arr)
    {
        int[] array = null;
        int count = 0;
        int max = arr [0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max)
                {
                    max = arr [i][j];
                }
            }
            array[count++] = max;
        }
        return array;
    }
}
