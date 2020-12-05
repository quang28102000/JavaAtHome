import java.util.Scanner;

public class chapter4_exercise4
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap mot so bat ky: ");
        int n = console.nextInt();
        checking(n);
    }
    public static void checking (int a)
    {
        if (a % 2 == 1)
        {
            System.out.println (a + " is odd");
        }
        else
        {
            System.out.println (a + " is even");
        }
    }
}
