package Chapter09;

public class EmployeeMain2
{
    public static void main (String[] args)
    {
        System.out.print("Lawyer: ");
        Lawyer lawyer = new Lawyer();
        System.out.println(lawyer.getHours() + ", $" + lawyer.getSalary() + ", " + lawyer.getVacationDays() + ", " + lawyer.getVacationForm());
        lawyer.sue();

        System.out.println();
        System.out.print("Legal Secretary: ");
        LegalSecretary legalSecretary = new LegalSecretary();
        System.out.println(legalSecretary.getHours() + ", $" + legalSecretary.getSalary() + ", " + legalSecretary.getVacationDays() + ", " + legalSecretary.getVacationForm());
        legalSecretary.takeDictation("Neato");
        legalSecretary.fileLegalBriefs();
    }
}
