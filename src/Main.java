import java.io.IOException;
import java.util.Scanner;

public class Main
{
    private static void fillHandle(Triangle[] triangles)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 6 values of view (x1, y1), (x2, y2), (x3,y3) for each triangle");
        for(int i=0; i< triangles.length; i++)
        {
            System.out.print((i+1)+": ");
            triangles[i]=new Triangle(new Point(in.nextInt(), in.nextInt()),
                    new Point(in.nextInt(), in.nextInt()),
                    new Point(in.nextInt(), in.nextInt()));
        }

    }
    private static void fillRandom(Triangle[] triangles)
    {
    double max=100;
    for(int i=0; i< triangles.length; i++)
    {
         triangles[i]=new Triangle(new Point(Math.random()*max, Math.random()*max),
                 new Point(Math.random()*max, Math.random()*max),
                 new Point(Math.random()*max, Math.random()*max));
    }
    }
    private static void printMinArea(Triangle[] triangles)
    {
        double minOfEquilateral= Double.MAX_VALUE;
        double minOfIsosceles=Double.MAX_VALUE;
        double minOfRectangular=Double.MAX_VALUE;
        double minOfArbitrary=Double.MAX_VALUE;
        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral>triangles[i].getArea()) minOfEquilateral=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(minOfIsosceles>triangles[i].getArea()) minOfIsosceles=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular>triangles[i].getArea()) minOfRectangular=triangles[i].getArea();
            }
            else if(minOfArbitrary>triangles[i].getArea()) minOfArbitrary=triangles[i].getArea();
        }

        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral==triangles[i].getArea())
                {
                    System.out.println("Minimum Area in Equilateral:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(minOfIsosceles==triangles[i].getArea())
                {
                    System.out.println("Minimum Area in Isosceles:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular==triangles[i].getArea())
                {
                    System.out.println("Minimum Area in Rectangular:");
                    System.out.println(triangles[i]);
                }
            }
            else if(minOfArbitrary==triangles[i].getArea())
            {
                System.out.println("Minimum Area in Arbitrary:");
                System.out.println(triangles[i]);
            }
        }
    }
    private static void printMaxArea(Triangle[] triangles)
    {
        double maxOfEquilateral=0;
        double maxOfIsosceles=0;
        double maxOfRectangular=0;
        double maxOfArbitrary=0;
        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral<triangles[i].getArea()) maxOfEquilateral=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(maxOfIsosceles<triangles[i].getArea()) maxOfIsosceles=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular<triangles[i].getArea()) maxOfRectangular=triangles[i].getArea();
            }
            else if(maxOfArbitrary<triangles[i].getArea()) maxOfArbitrary=triangles[i].getArea();
        }

        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral==triangles[i].getArea())
                {
                    System.out.println("Maximum Area in Equilateral:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(maxOfIsosceles==triangles[i].getArea())
                {
                    System.out.println("Maximum Area in Isosceles:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular==triangles[i].getArea())
                {
                    System.out.println("Maximum Area in Rectangular:");
                    System.out.println(triangles[i]);
                }
            }
            else if(maxOfArbitrary==triangles[i].getArea())
            {
                System.out.println("Maximum Area in Arbitrary:");
                System.out.println(triangles[i]);
            }
        }
    }
    private static void printMinPerimeter(Triangle[] triangles)
    {
        double minOfEquilateral= Double.MAX_VALUE;
        double minOfIsosceles=Double.MAX_VALUE;
        double minOfRectangular=Double.MAX_VALUE;
        double minOfArbitrary=Double.MAX_VALUE;
        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral>triangles[i].getPerimeter()) minOfEquilateral=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(minOfIsosceles>triangles[i].getPerimeter()) minOfIsosceles=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular>triangles[i].getPerimeter()) minOfRectangular=triangles[i].getArea();
            }
            else if(minOfArbitrary>triangles[i].getPerimeter()) minOfArbitrary=triangles[i].getArea();
        }

        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral==triangles[i].getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Equilateral:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(minOfIsosceles==triangles[i].getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Isosceles:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular==triangles[i].getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Rectangular:");
                    System.out.println(triangles[i]);
                }
            }
            else if(minOfArbitrary==triangles[i].getPerimeter())
            {
                System.out.println("Minimum Perimeter in Arbitrary:");
                System.out.println(triangles[i]);
            }
        }

    }
    private static void printMaxPerimeter(Triangle[] triangles)
    {
        double maxOfEquilateral=0;
        double maxOfIsosceles=0;
        double maxOfRectangular=0;
        double maxOfArbitrary=0;
        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral<triangles[i].getPerimeter()) maxOfEquilateral=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(maxOfIsosceles<triangles[i].getPerimeter()) maxOfIsosceles=triangles[i].getArea();
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular<triangles[i].getPerimeter()) maxOfRectangular=triangles[i].getArea();
            }
            else if(maxOfArbitrary<triangles[i].getPerimeter()) maxOfArbitrary=triangles[i].getArea();
        }

        for(int i=0; i< triangles.length; i++)
        {
            if(triangles[i].typeTriangle==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral==triangles[i].getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Equilateral:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.ISOSCELES)
            {
                if(maxOfIsosceles==triangles[i].getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Isosceles:");
                    System.out.println(triangles[i]);
                }
            }
            else if(triangles[i].typeTriangle==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular==triangles[i].getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Rectangular:");
                    System.out.println(triangles[i]);
                }
            }
            else if(maxOfArbitrary==triangles[i].getPerimeter())
            {
                System.out.println("Maximum Perimeter in Arbitrary:");
                System.out.println(triangles[i]);
            }
        }
    }

    private static int getNumberOfTriangles()
    {
        int numberOfTringles=0;
        System.out.print("Number of Triangles: ");
        Scanner in = new Scanner(System.in);
        numberOfTringles = in.nextInt();

        if(numberOfTringles<=0)throw new RuntimeException();
        return numberOfTringles;
    }

    private static void printNumberOfTypesOfTriangles(Triangle[] triangles)
    {
        int numOfEqulateral = 0;
        int numOfIsosceles = 0;
        int numOfRectangular = 0;
        int numOfArbitrary = 0;

        for (int i = 0; i < triangles.length; i++)
        {
            TypeTriangle typeTriangle = triangles[i].defineType();
            if (typeTriangle == TypeTriangle.EQUILATERAL) numOfEqulateral++;
            else if (typeTriangle == TypeTriangle.ISOSCELES) numOfIsosceles++;
            else if (typeTriangle == TypeTriangle.RECTANGULAR) numOfRectangular++;
            else if (typeTriangle == TypeTriangle.ARBITRARY) numOfArbitrary++;
        }
        System.out.println("Types of Triangles: ");
        System.out.println("Equlateral - " + numOfEqulateral);
        System.out.println("Isosceles - " + numOfIsosceles);
        System.out.println("Rectangular - " + numOfRectangular);
        System.out.println("Arbitrary - " + numOfArbitrary);
    }

    private static void fillTriangles(Triangle[] triangles)
    {
        System.out.print("Choose the way of filling(Handle-0, Random-1):");
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
if(val==0) fillHandle(triangles);
else if(val==1)fillRandom(triangles);
else throw new RuntimeException();
    }

    public static void main(String[] args)
    {
        Triangle[] triangles=new Triangle[getNumberOfTriangles()];
        fillTriangles(triangles);

        printNumberOfTypesOfTriangles(triangles);

        printMaxArea(triangles);
        printMinArea(triangles);
        printMaxPerimeter(triangles);
        printMinPerimeter(triangles);
    }
}