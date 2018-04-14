public class Point
{
   double x,y;
   String n;

   Point()
   {  x=y=0;
       n="";
    }
   
   Point(String nm,double nx,double ny)
   {
       n=nm;
       x=nx;
       y=ny;
    }
    
    void display()
    {
        System.out.println(n+"("+x+","+y+")");
    }
}