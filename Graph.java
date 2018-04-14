
/**
 * Write a description of class graph here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph
{

   double m,c;
 String gr[][]=new String[51][51];
 
 String pen;
   
   Graph()
   {
       m=c=0;
       pen="##";
        
       for(int i=0;i<51;i++)
       {
           for(int j=0;j<51;j++)
             gr[i][j]="  ";
        }
       
        gr[0][25]="Y-axis";
        for(int l=1;l<51;l++)
        gr[l][25]="| ";
        
       for(int k=0;k<50;k++)
        gr[25][k]="--";
        gr[25][50]="X-axis";
        
         
       
    }
    
    void reset()
    {
        for(int i=0;i<51;i++)
       {
           for(int j=0;j<51;j++)
             gr[i][j]="  ";
        }
       
        gr[0][25]="Y-axis";
        for(int l=1;l<51;l++)
        gr[l][25]="| ";
        
       for(int k=0;k<50;k++)
        gr[25][k]="--";
        gr[25][50]="X-axis";
    }
    
    void MarkPoint(Point P)
    {
        double nx=P.x;
        double ny=P.y;
        String p=P.n;
        int i=(int)nx;
        int j=(int)ny;
        
        i=i+25;
        j=25-j;
        
        gr[j][i]="@"+p;
    }
        
    
  void sketch(double mm,double cc)
  {
           
      m=mm;
      c=cc;
      
      int x;
      int y;
      
      int i,j;
      
      for(int k=-25;k<=25;k++)
      {
          x=k;
          y=(int)((m*x)+c);
          
          i=25+x;
          j=25-y;
          
          if(((i>0)&&(i<51))&&((j>0)&&(j<51)))
          gr[j][i]=pen;
          
        }
    }
    
    void sketchX(double cy)
    {
        int i=(int)cy;
        i=25-i;
       for(int k=0;k<50;k++)
        gr[i][k]=pen;
    }
    
    void sketchY(double cx)
    {
        int j=(int)cx;
        j=25+j;
        for(int l=1;l<51;l++)
        gr[l][j]=pen;
    }
      
    
   void  display()
   {
       for(int i=0;i<51;i++)
       {
           for(int j=0;j<51;j++)
           System.out.print(gr[i][j]);
           
           System.out.println();
        }
    }
    
      
    }
