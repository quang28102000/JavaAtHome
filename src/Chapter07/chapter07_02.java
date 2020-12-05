public class chapter07_02
{
    public static void main (String [] args)
    {
        String name = "Quang";
        String result = "";
        for (int i = 0; i < name.length(); i++)
        {
            result = name.charAt(i) + result;
        }
        System.out.print(result);
    }
}
