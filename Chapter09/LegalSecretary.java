package Chapter09;

public class LegalSecretary extends Secretary
{
    public double getSalary()
    {
        return super.getSalary() + 5000; //$5000 more than general employees
    }

    public void fileLegalBriefs()
    {
        System.out.println("I could file all day!");
    }
}
