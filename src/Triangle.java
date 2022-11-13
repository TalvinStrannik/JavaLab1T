
import static java.lang.Math.*;

enum TypeTriangle
{
   EQUILATERAL, ISOSCELES, RECTANGULAR, ARBITRARY
}

public class Triangle
{
   TypeTriangle typeTriangle = TypeTriangle.ARBITRARY;
   boolean isIsosceles=false;
   Point a;
   Point b;
   Point c;
   double ab, ac, bc;
   double area;
   double perimeter;

   Triangle(Point a, Point b, Point c)
   {
      if(!isCorrect(a, b, c)) throw new RuntimeException();
      setABC(a, b, c);
   }
   boolean isCorrect(Point a, Point b, Point c)
   {
      if(a.compareTo(b)==0 || a.compareTo(c)==0 || b.compareTo(c)==0) return false;
      return true;
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

      typeTriangle = TypeTriangle.ARBITRARY;
   }
   TypeTriangle defineType()
   {
      if((ab>=ac-1e-8 && ab<=ac+1e-8) && (bc>=ac-1e-8 && bc<=ac+1e-8) && (ab>=bc-1e-8 && ab<=bc+1e-8))
      {
         typeTriangle=typeTriangle.EQUILATERAL;
         isIsosceles=true;
      }
      else if((ab>=ac-1e-8 && ab<=ac+1e-8) || (bc>=ac-1e-8 && bc<=ac+1e-8) || (ab>=bc-1e-8 && ab<=bc+1e-8))
      {
         typeTriangle=typeTriangle.ISOSCELES;
         isIsosceles=true;
      }
      if((1/2.0*(ab*ac)>=area-1e-8 && 1/2.0*(ab*ac)<=area+1e-8) || (1/2.0*(bc*ac)>=area-1e-8 && 1/2.0*(bc*ac)<=area+1e-8)
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
   TypeTriangle getTypeTriangle() {return typeTriangle;}
   boolean isIsosceles(){return isIsosceles;}
   @Override
   public String toString()
   {
      return "1: "+a.toString()+" 2: "+b.toString()+" 3: "+c.toString()+"\n"+"Area: "+area+" Perimeter: "+perimeter;
   }
}
