package Chapter09;

public class EmployeeMain
{
    public static void main (String[] args)
    {
        System.out.print("Employee: ");
        Employee employee = new Employee();
        System.out.println(employee.getHours() + ", $" + employee.getSalary() + ", " + employee.getVacationDays() + ", " + employee.getVacationForm());

        System.out.println();
        System.out.print("Secretary: ");
        Secretary secretary = new Secretary();
        System.out.println(secretary.getHours() + ", $" + secretary.getSalary() + ", " + secretary.getVacationDays() + ", " + secretary.getVacationForm());
        secretary.takeDictation("Hello");
    }
}
