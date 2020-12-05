//give introduction
//prompt for velocity, angle and number of steps
//produce table
import java.util.*;
public class trajectoryStructuredSolution
{
    //constant for Earth acceleration in meter / second ^ 2
    public static final double ACCELERATION = -9.81;
    //prompt for velocity, angle and number of steps
    public static void main (String [] args)
    {
        Scanner console = new Scanner (System.in);
        giveIntro();
        System.out.print ("velocity (meters/second): ");
        double velocity = console. nextDouble ();
        System.out.print ("angle (degrees): ");
        double angle = Math.toRadians(console.nextDouble());
        System.out.print ("number of steps to display: ");
        int steps = console. nextInt();
        System.out.println ();
        printTable (velocity, angle, steps);
    }
    //print table function
    public static void printTable (double velocity, double angle, int steps) //khong truyen gia tri cho ham khac nen dung void
    {
        double xVelocity = velocity * Math.cos (angle);
        double yVelocity = velocity * Math.sin (angle);
        double totalTime = -2.0 * yVelocity / ACCELERATION;
        double timeIncrement = totalTime / steps;
        double xIncrement = xVelocity * timeIncrement;

        double x = 0.0;
        double y = 0.0;
        double t = 0.0;
        System.out.println ("step\tx \t\ty \t\ttime");
        System.out.println ("0   \t0.0 \t0.0 \t0.0");
        for (int i = 1; i <= steps; i++)
        {
            t += timeIncrement;
            x += xIncrement;
            y = displacement (yVelocity, ACCELERATION, t); //can phai co mot phep tinh khac nen la phai viet 1 function roi truyen vao
            System.out.println (i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
        }
    }
    public static double displacement (double v, double a, double t)
    {
        return (v * t) + ((a * Math.pow(t , 2)) / 2);
    }
    //round n to 2 digits after the decimal point
    public static double round2 (double n)
    {
        return Math.round (n * 100.0) / 100.0;
    }
    //give a brief introduction to the user
    public static void giveIntro ()
    {
        System.out.println ("This programme computes the");
        System.out.println ("trajectory of a projectile given");
        System.out.println ("its initial velocity and its");
        System.out.println ("angle relative to the");
        System.out.println ("horizontal");
        System.out.println ();
    }
}
