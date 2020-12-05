import java.util.*;
public class interactiveProgram
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner (System.in);
        //obtain values
        System.out.println ("This program computes monthly mortgage payments.");
        System.out.print ("Loan amount: ");
        double loan = console. nextDouble();
        System.out.print ("Number of years: ");
        int years = console. nextInt();
        System.out.print ("Interest rate: ");
        double rate = console. nextDouble();
        System.out.println ();
        //compute result and report
        int n = 12 * years;
        double c = rate / 12.0 / 100.0;
        double payment = loan * c * Math.pow (1 + c , n) / (Math.pow (1 + c, n ) - 1);
        System.out.print("Payment = $" + (int) payment); // cast the double (payment) to an integer
    }
}
