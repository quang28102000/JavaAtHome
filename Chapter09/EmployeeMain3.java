package Chapter09;

public class EmployeeMain3
{
    public static void main (String[] args)
    {
        Employee adna = new Employee();
        Lawyer lucy =  new Lawyer();
        Secretary stan = new Secretary();
        LegalSecretary leo = new LegalSecretary();

        printInfo(adna);
        printInfo(lucy);
        printInfo(stan);
        printInfo(leo);
    }
    public static void printInfo (Employee e)
    {
        System.out.println(e.getHours() + ", $" + e.getSalary() + ", " + e.getVacationDays() + ", " + e.getVacationForm() + ", " + e);

    }
}

