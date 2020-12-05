public class Chapter09_OOP_constructorExercises
{
    public class Name
    {
        String firstName;
        char middleInitial;
        String lastName;

        //Initializes a new Name with the given values

        public Name (String firstName, char middleInitial, String lastName)
        {
            this.firstName = firstName;
            this.middleInitial = middleInitial;
            this.lastName = lastName;
        }
        //the name in normal order
        public String getNormalOrder()
        {
            return firstName + " " + middleInitial + ". " + lastName;
        }
        //the name in reverse order
        public String getReverseOrder()
        {
            return lastName + ", " + firstName + " " + middleInitial + ".";
        }
    }
}
