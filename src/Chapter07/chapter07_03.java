public class chapter07_03
{
    public static void main (String [] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {2,3,4,5,6,7,8,9,10};
        if (compare(arr1,arr2) == true)
        {
            System.out.print("true");
        }else
        {
            System.out.print("false");
        }
    }
    public static boolean compare (int[] data1, int[] data2)
    {
        if (data1.length != data2.length)
        {
            return false;
        }else
        {
            for (int i = 0; i < data1.length; i++)
            {
                if (data1[i] >= data2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
