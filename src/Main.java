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
            triangles[i]=new Triangle(
                    new Point(in.nextDouble(), in.nextDouble()),
                    new Point(in.nextDouble(), in.nextDouble()),
                    new Point(in.nextDouble(), in.nextDouble()));
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
        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral>thisTriangle.getArea()) minOfEquilateral=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(minOfIsosceles>thisTriangle.getArea()) minOfIsosceles=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular>thisTriangle.getArea()) minOfRectangular=thisTriangle.getArea();
            }
            else if(minOfArbitrary>thisTriangle.getArea()) minOfArbitrary=thisTriangle.getArea();
        }
        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral==thisTriangle.getArea())
                {
                    System.out.println("Minimum Area in Equilateral:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(minOfIsosceles==thisTriangle.getArea())
                {
                    System.out.println("Minimum Area in Isosceles:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular==thisTriangle.getArea())
                {
                    System.out.println("Minimum Area in Rectangular:");
                    System.out.println(thisTriangle);
                }
            }
            else if(minOfArbitrary==thisTriangle.getArea())
            {
                System.out.println("Minimum Area in Arbitrary:");
                System.out.println(thisTriangle);
            }
        }
    }
    private static void printMaxArea(Triangle[] triangles)
    {
        double maxOfEquilateral=0;
        double maxOfIsosceles=0;
        double maxOfRectangular=0;
        double maxOfArbitrary=0;
        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral<thisTriangle.getArea()) maxOfEquilateral=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(maxOfIsosceles<thisTriangle.getArea()) maxOfIsosceles=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular<thisTriangle.getArea()) maxOfRectangular=thisTriangle.getArea();
            }
            else if(maxOfArbitrary<thisTriangle.getArea()) maxOfArbitrary=thisTriangle.getArea();
        }

        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral==thisTriangle.getArea())
                {
                    System.out.println("Maximum Area in Equilateral:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(maxOfIsosceles==thisTriangle.getArea())
                {
                    System.out.println("Maximum Area in Isosceles:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular==thisTriangle.getArea())
                {
                    System.out.println("Maximum Area in Rectangular:");
                    System.out.println(thisTriangle);
                }
            }
            else if(maxOfArbitrary==thisTriangle.getArea())
            {
                System.out.println("Maximum Area in Arbitrary:");
                System.out.println(thisTriangle);
            }
        }
    }
    private static void printMinPerimeter(Triangle[] triangles)
    {
        double minOfEquilateral= Double.MAX_VALUE;
        double minOfIsosceles=Double.MAX_VALUE;
        double minOfRectangular=Double.MAX_VALUE;
        double minOfArbitrary=Double.MAX_VALUE;
        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral>thisTriangle.getPerimeter()) minOfEquilateral=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(minOfIsosceles>thisTriangle.getPerimeter()) minOfIsosceles=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular>thisTriangle.getPerimeter()) minOfRectangular=thisTriangle.getArea();
            }
            else if(minOfArbitrary>thisTriangle.getPerimeter()) minOfArbitrary=thisTriangle.getArea();
        }

        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(minOfEquilateral==thisTriangle.getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Equilateral:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(minOfIsosceles==thisTriangle.getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Isosceles:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(minOfRectangular==thisTriangle.getPerimeter())
                {
                    System.out.println("Minimum Perimeter in Rectangular:");
                    System.out.println(thisTriangle);
                }
            }
            else if(minOfArbitrary==thisTriangle.getPerimeter())
            {
                System.out.println("Minimum Perimeter in Arbitrary:");
                System.out.println(thisTriangle);
            }
        }

    }
    private static void printMaxPerimeter(Triangle[] triangles)
    {
        double maxOfEquilateral=0;
        double maxOfIsosceles=0;
        double maxOfRectangular=0;
        double maxOfArbitrary=0;
        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral<thisTriangle.getPerimeter()) maxOfEquilateral=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(maxOfIsosceles<thisTriangle.getPerimeter()) maxOfIsosceles=thisTriangle.getArea();
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular<thisTriangle.getPerimeter()) maxOfRectangular=thisTriangle.getArea();
            }
            else if(maxOfArbitrary<thisTriangle.getPerimeter()) maxOfArbitrary=thisTriangle.getArea();
        }

        for(Triangle thisTriangle:triangles)
        {
            if(thisTriangle.getTypeTriangle()==TypeTriangle.EQUILATERAL)
            {
                if(maxOfEquilateral==thisTriangle.getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Equilateral:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.ISOSCELES || thisTriangle.isIsosceles())
            {
                if(maxOfIsosceles==thisTriangle.getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Isosceles:");
                    System.out.println(thisTriangle);
                }
            }
            else if(thisTriangle.getTypeTriangle()==TypeTriangle.RECTANGULAR)
            {
                if(maxOfRectangular==thisTriangle.getPerimeter())
                {
                    System.out.println("Maximum Perimeter in Rectangular:");
                    System.out.println(thisTriangle);
                }
            }
            else if(maxOfArbitrary==thisTriangle.getPerimeter())
            {
                System.out.println("Maximum Perimeter in Arbitrary:");
                System.out.println(thisTriangle);
            }
        }
    }

    private static int setNumberOfTriangles()
    {
        int numberOfTriangles;
        System.out.print("Number of Triangles: ");
        Scanner in = new Scanner(System.in);
        numberOfTriangles = in.nextInt();

        if(numberOfTriangles<=0)throw new RuntimeException();
        return numberOfTriangles;
    }

    private static void printNumberOfTypesOfTriangles(Triangle[] triangles)
    {
        int numOfEquilateral= 0;
        int numOfIsosceles = 0;
        int numOfRectangular = 0;
        int numOfArbitrary = 0;

        for (Triangle thisTriangle:triangles)
        {
            TypeTriangle typeTriangle = thisTriangle.defineType();
            if (typeTriangle == TypeTriangle.EQUILATERAL) numOfEquilateral++;
            else if (typeTriangle == TypeTriangle.ISOSCELES || thisTriangle.isIsosceles) numOfIsosceles++;
            if (typeTriangle == TypeTriangle.RECTANGULAR) numOfRectangular++;
            else if (typeTriangle == TypeTriangle.ARBITRARY) numOfArbitrary++;
        }
        System.out.println("Types of Triangles: ");
        System.out.println("Equilateral - " + numOfEquilateral);
        System.out.println("Isosceles - " + numOfIsosceles);
        System.out.println("Rectangular - " + numOfRectangular);
        System.out.println("Arbitrary - " + numOfArbitrary);
    }
    private static void fillTriangles(Triangle[] triangles)
    {
        System.out.print("Choose the way of filling(0-Handle, 1-Random):");
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        if(val==0) fillHandle(triangles);
        else if(val==1)fillRandom(triangles);
        else throw new RuntimeException();
    }

    private static void printAllTriangles(Triangle[] triangles)
    {
        System.out.println("Print All Triangles(1-Y, 0-N)?");
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        if(val==1)
        {
            for(int i=0; i<triangles.length; i++)
            {
                System.out.println((i+1)+ " Triangle:");
                System.out.println(triangles[i]);
            }
        }
        else throw new RuntimeException();
    }

    public static void main(String[] args)
    {
        int numberOfTriangles=setNumberOfTriangles();
        Triangle[] triangles=new Triangle[numberOfTriangles];
        fillTriangles(triangles);

        printNumberOfTypesOfTriangles(triangles);
        printAllTriangles(triangles);

        printMaxArea(triangles);
        printMinArea(triangles);
        printMaxPerimeter(triangles);
        printMinPerimeter(triangles);
    }
}
