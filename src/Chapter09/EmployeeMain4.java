package Chapter09;

public class EmployeeMain4
{
    public static void main (String[] args)
    {
        Employee[] employees = {new Employee(), new Lawyer(), new Secretary(), new LegalSecretary()};

        for (Employee e : employees)
        {
            System.out.println(e.getHours() + ", $" + e.getSalary() + ", " + e.getVacationDays() + ", " + e.getVacationForm() + ", " + e);
        }
    }
}
