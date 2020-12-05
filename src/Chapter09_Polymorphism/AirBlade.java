package Chapter09_Polymorphism;

class Bike
{
    public void run()
    {
        System.out.println("Running!");
    }
}
public class AirBlade extends Bike
{
    public void run()
    {
        System.out.println("Running safely with 60 km");
    }

    public static void main (String[] args)
    {
        Bike b = new AirBlade();
        b.run();
    }
}
