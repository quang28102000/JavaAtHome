public class Point
{   //fields
    private int x;
    private int y;

    //constructors
    //construct a new Point at the ORIGIN (0,0)
    public Point()
    {
        this (0,0); //call Point (int, int) constructor
    }

    //constructs a new point with the GIVEN (x,y) location
    public Point(int x, int y)
    {
        setLocation(x,y);  //thu gop codes cua setLocation vao day

    }

    //methods
    //returns the distance between this point and (0,0) <--> accessor
    public double distanceFromOrigin ()
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    //returns the x-coordinate of this point
    public int getX()
    {
        return x;
    }

    //return the x-coordinates of this point
    public int getY()
    {
        return y;
    }

    public void setX (int x)
    {
        this.x = x;
    }
    public void setY (int y)
    {
        this.y = y;
    }
    //sets this point's (x,y) location to the given values
    public void setLocation (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + ". " + y + ")";
    }

    //shift this point's location by the given amount
    public void translate (int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public double distance (java.awt.Point other)
    {
        int dx = x - other.x;
        int dy = y - other.y;
        return (Math.pow(dx,2) + Math.pow(dy,2));
    }

    public static void main (String []args)
    {
        Point ob1 = new Point();
        ob1.x = 2;
        ob1.y = 4;

        System.out.println("distance from origin = " + ob1.distanceFromOrigin());
        ob1.translate(11,6);
        System.out.println(ob1.x);
        System.out.println(ob1.y);
    }
}
class PointMain
{
    public static void main (String []args)
    {
        //creates two Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4,3);

        //print each point and its distance from the origin
        System.out.println("p1 is " + p1);
        System.out.println("distance from origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
        System.out.println("distance from origin = " + p2.distanceFromOrigin());

        //translate each point to a new location
        p1.translate(11,6);
        p2.translate(1, 7);

        //print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
    }
}

