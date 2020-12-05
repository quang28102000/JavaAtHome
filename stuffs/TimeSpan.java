public class TimeSpan
{
    //create fields
    private int hours;
    private int minutes;

    //Constructs a time span with the given interval
    //pre: hours >= 0 && minutes >= 0
    public TimeSpan (int hours, int minutes)
    {
        this.hours = 0;
        this.minutes = 0;

    }

    //Add the given interval to this time span
    //pre: hours >= 0 && minutes >= 0
    //mutator
    public void add (int hours, int minutes)
    {
        if (hours <= 0 || minutes <=0)
        {
            throw new IllegalArgumentException();
        }
        //translate process
        this.hours += hours;
        this.minutes += minutes;

        //converts
        this.hours = hours + minutes/60;
        this.minutes = minutes % 60;
    }

    //return a String for tis time span, such "6h 15m"
    public String toString()
    {
        return hours + "h " + minutes + "m";
    }
}
