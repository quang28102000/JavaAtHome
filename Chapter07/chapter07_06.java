public class chapter07_06
{
    public static void main (String[] args)
    {
        String[] arr = {"belt","hat","jelly","bubble gum"};
        System.out.print(average(arr));
    }
    public static double average (String[] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
        {
            sum += data[i].length();
        }
        return (double) sum/(data.length);
    }
}
