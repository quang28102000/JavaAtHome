// Single Inheritance
class Animal
{
    void eat ()
    {
        System.out.print("Eating");
    }
}
class Dog extends Animal
{
    void bark ()
    {
        System.out.println("Barkinggggggg");
    }
}
class BabyDog extends Dog
{
    void weep ()
    {
        System.out.println("Weepinggggggg");
    }
}
public class TestInheritance1
{
    public static void main (String args [])
        {
            BabyDog d = new BabyDog();
            d.bark();
            d.eat();
            d.weep();
        }
}
