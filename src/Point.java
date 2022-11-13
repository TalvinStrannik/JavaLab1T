public class Point implements Comparable <Point>
{
    private double x;
    private double y;
    Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    @Override
    public int compareTo(Point another)
    {
       if(this.x==another.x && this.y==another.y) return 0;
       else return -1;
    }
    @Override
    public String toString()
    {
        return "X: "+x+", Y: "+y;
    }

}
