public class OOP_exercise4
{
    public static void main (String [] args)
    {
        OOP_exercise4 object1 = new OOP_exercise4 ();
        object1.timSoTrungGian (10,3,0);
    }
    public static void timSoTrungGian (int a, int b, int c)
    {
        //kiem tra xem a co phai la so trung gian
        if (a > b && a < c || a > c && a < b)
        {
            System.out.print ("a la so trung gian !");
        }else if (b > a && b < c || b > c && b < a)
        {
            System.out.print ("b la so trung gian !");
        }else
        {
            System.out.print ("c la so trung gian !");
        }
    }
}
