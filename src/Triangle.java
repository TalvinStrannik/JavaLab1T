import java.lang.Enum;
import java.util.Scanner;

import static java.lang.Math.*;

enum TypeTriangle
{
   EQUILATERAL, ISOSCELES, RECTANGULAR, ARBITRARY
}

public class Triangle
{
   public TypeTriangle typeTriangle = TypeTriangle.ARBITRARY;

   Point a;
   Point b;
   Point c;

   double ab, ac, bc;
   double area;
   double perimeter;
   Triangle(Point a, Point b, Point c)
   {
      setABC(a, b, c);
   }

   void setABC(Point a, Point b, Point c)
   {
      if(a==null || b==null || c==null) throw new NullPointerException();

      this.a=a;
      this.b=b;
      this.c=c;

      ab=sqrt(pow((b.getX()-a.getX()),2)+pow((b.getY()-a.getY()),2));
      ac=sqrt(pow((c.getX()-a.getX()),2)+pow((c.getY()-a.getY()),2));
      bc=sqrt(pow((b.getX()-c.getX()),2)+pow((b.getY()-c.getY()),2));

      area=abs(1/2.0*((a.getX()-c.getX())*(b.getY()-c.getY())-(a.getY()-c.getY())*(b.getX()-c.getX())));
      perimeter=ab+ac+bc;
   }

   TypeTriangle defineType()
   {
      if((ab>=ac-1e-8 && ab<=ac+1e-8) && (bc>=ac-1e-8 && bc<=ac+1e-8) && (ab>=bc-1e-8 && ab<=bc+1e-8))
         typeTriangle=typeTriangle.EQUILATERAL;
      else if((ab>=ac-1e-8 && ab<=ac+1e-8) || (bc>=ac-1e-8 && bc<=ac+1e-8) || (ab>=bc-1e-8 && ab<=bc+1e-8))
         typeTriangle=typeTriangle.ISOSCELES;
      else if((1/2.0*(ab*ac)>=area-1e-8 && 1/2.0*(ab*ac)<=area+1e-8) || (1/2.0*(bc*ac)>=area-1e-8 && 1/2.0*(bc*ac)<=area+1e-8)
              || (1/2.0*(ab*bc)>=area-1e-8 && 1/2.0*(ab*bc)<=area+1e-8))
         typeTriangle=typeTriangle.RECTANGULAR;

      return typeTriangle;
   }
   double getArea()
   {
      return area;
   }
   double getPerimeter()
   {
      return area;
   }

   @Override
   public String toString()
   {
      return "1: "+a.toString()+" 2: "+b.toString()+" 3: "+c.toString()+"\n"+"Area: "+area+" Perimeter: "+perimeter;
   }

}