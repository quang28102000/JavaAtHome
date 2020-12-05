public class Chapter4_exercise22
{
    public static void main (String [] args)
    {
        fibonacci(5);
    }
    public static void fibonacci (int n)
    {
        int previousNumber = 1;
        int followingNumber = 2;
        int i = 1;
        System.out.print ("Fibonacci of #"+ n + " numbers: ");
        while (i <= n)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + followingNumber;
            previousNumber = followingNumber;
            followingNumber = sum;
            i++;
        }
    }
}
