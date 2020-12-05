public class Chapter09_OOP_personName
{
    public class name
    {
        private String firstName = "John";
        private String lastName = "Public";
        private char middleInitial = 'Q';

        //method access to the class returns a value when the fields are is private mode
        //accessors
        //RETURNS the person's first name - tra lai gia tri ra man hinh console hoac cho cac ham khac su dung
        public String getFirstName ()
        {
            return firstName;
        }

        public String getLastName ()
        {
            return lastName;
        }
        public char getMiddleInitial ()
        {
            return middleInitial;
        }

        //method show information and don't return a value
        //mutator
        //SET the first name to the given value - lay gia tri tu users dua vao class
        public void setFirstName (String firstName)
        {
            this.firstName = firstName;
        }

        public void setLastName (String lastName)
        {
            this.lastName = lastName;
        }
        public void setMiddleInitial (char middleInitial)
        {
            this.middleInitial = middleInitial;
        }


        public String getNormalOrder()
        {
            return firstName + " " + middleInitial + ". " + lastName;
        }
        public String getReverseOrder()
        {
            return lastName + ", " + firstName + " " + middleInitial + ". ";
        }
        public String toString ()
        {
            return getNormalOrder();
        }
        public name (String firstName, char middleInitial, String lastName)
        {
            this.firstName = firstName;
            this.middleInitial = middleInitial;
            this.lastName = lastName;
        }
    }
}
