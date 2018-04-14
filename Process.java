
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Process
{
    Point A, B;
    Graph G=new Graph();
    
    
    

    void findDistance(Point A,Point B)
    {
        G.MarkPoint(A);
        G.MarkPoint(B);
        
        G.display();
        
        double dis;
        dis=Math.sqrt(Math.pow((A.x-B.x),2)+Math.pow((A.y-B.y),2));
        System.out.println("Distance between"+"A("+A.x+","+A.y+")"+" & "+"B("+B.x+","+B.y+")"+"   ="+dis);
        
            
    }

    void findMidPoint(Point A,Point B)
    {
        double mx,my;
        
        G.MarkPoint(A);
        G.MarkPoint(B);
        G.display();
        
        mx=(A.x+B.x)/2.0;
        my=(A.y+B.y)/2.0;
        
        Point C=new Point("M",mx,my);
        System.out.println("MidPoint between "+A.n+"("+A.x+","+A.y+")"+" & "+B.n+"("+B.x+","+B.y+")"+"   =");
      
        C.display();
        
        System.out.println("\n"+"\n"+"\n");
        
        G.MarkPoint(C);
        G.display();
        
    }
    
    void findSlope(Point A,Point B)
    {
        G.MarkPoint(A);
        G.MarkPoint(B);
        
        G.display();
        
        double slope=(B.y-A.y)/(B.x-A.x);
        System.out.println("Slope between "+A.n+"("+A.x+","+A.y+")"+" & "+B.n+"("+B.x+","+B.y+")"+"  ="+slope);
      
    }
    
    private int hcf(int a,int b)
    {
        int hcf;
        hcf=1;
        for(int i=2;i<=(Math.min(a,b));i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                hcf=i;
            }
        }
        
        return(hcf);
    }
    
    private int hcf(int a,int b,int c)
    {
        int hcf;
        hcf=1;
        for(int i=2;((i<=a)&&(i<=b)&&(i<=c));i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                hcf=i;
            }
        }
        
        return(hcf);
    }
   
    
    
    void findEquation(Point A,Point B)
    {
        
         int b=(int)(B.y-A.y);
         int a=(int)(B.x-A.x);
         
         int p=Math.abs(a);
         int q=Math.abs(b);
        int h;
        
        System.out.println("Equation of line passing through "+"A("+A.x+","+A.y+")"+" & "+"B("+B.x+","+B.y+")");
        
       if(b==0)
       {
           System.out.println("y = "+(A.y));
          
           G.sketchX((A.y));
           G.MarkPoint(A);
           G.MarkPoint(B);
           
           G.display();
    }
            
         
       else if(a==0)
        {
            System.out.println("x = "+(A.x));
            
           G.sketchY((A.x));
           G.MarkPoint(A);
           G.MarkPoint(B);
           
           G.display();
        
        }
        
        else
        {
            int m=(int)((A.y)*(B.x)-(B.y)*(A.x));
                   int r=Math.abs(m);
                   
                   double M=b/a;
                   double C=m/a;
            
            if(m==0)
            {
                if((a*b)>0)
                { 
                    System.out.println("y = "+q+"/"+p+"x"+"\n"+"\n"+
                    
                                        "or    "+p+"y ="+q+"x"+"\n");  
                                 
                                 h=hcf(p,q);       
                                 p=p/h;
                                 q=q/h;
                                 
                                 System.out.println("_____________________________");
                                 if((p==1)&&(q==1))
                                 System.out.println("or    y ="+"x");
                                 
                                 else if((p==1)&&(q!=1))
                                 System.out.println("or    y ="+q+"x");
                                 
                                 else if((p!=1)&&(q==1))
                                 System.out.println("or    "+p+"y = x");
                                 
                                 else
                                 System.out.println("or    "+p+"y ="+q+"x");
                                 System.out.println("_____________________________");
                    
                    
                                        
                  }
                  
                  else
                  {
                      System.out.println("y = "+"-"+q+"/"+p+"x"+"\n"+"\n"+
                    
                                        "or    "+p+"y ="+"-"+q+"x");  
                                        
                                        
                                h=hcf(p,q);       
                                 p=p/h;
                                 q=q/h;
                                 
                                 System.out.println("_____________________________");
                                 if((p==1)&&(q==1))
                                 System.out.println("or    y = "+"-x"+"\n");
                                 
                                 else if((p==1)&&(q!=1))
                                 System.out.println("or    y = -"+q+"x"+"\n");
                                 
                                 else if((p!=1)&&(q==1))
                                 System.out.println("or    "+p+"y = -x"+"\n");
                                 
                                 else
                                 System.out.println("or    "+p+"y = -"+q+"x"+"\n");
                                 System.out.println("_____________________________");
                      }
              }
              
              
              else
              {
                    if((a*b)>0)
                   { 
                          if((m*a)>0)
                         {
                              System.out.println("y = "+q+"/"+p+"x +"+r+"/"+p+"\n"+"\n"+
                    
                                        "or    "+p+"y ="+q+"x +"+r);  
                                        
                                h=hcf(p,q,r);
                                p=p/h;
                                q=q/h;
                                r=r/h;
                                        
                                        
                                System.out.println("_____________________________");
                                if((p==1)&&(q==1)&&(r==1))
                                System.out.println("or     y =x +1");
                                
                                else if((p==1)&&(q==1)&&(r!=1))
                                System.out.println("or     y = x +"+r);
                                
                                else if((p==1)&&(q!=1)&&(r==1))
                                System.out.println("or    y ="+q+"x +"+1);
                                
                                else if((p!=1)&&(q==1)&&(r==1))
                                System.out.println("or    "+p+"y = x +"+1);
                                
                                else if((p==1)&&(q!=1)&&(r!=1))
                                System.out.println("or    y ="+q+"x +"+r);
                                
                                else if((p!=1)&&(q==1)&&(r!=1))
                                System.out.println("or    "+p+"y = x +"+r);
                                
                                else if((p!=1)&&(q!=1)&&(r==1))
                                System.out.println("or    "+p+"y ="+q+"x +"+1);
                                
                                else
                                System.out.println("or    "+p+"y ="+q+"x +"+r);
                                System.out.println("_____________________________");
                                        
                                        
                                        
                         }
                         
                         else
                         {
                              System.out.println("y = "+q+"/"+p+"x -"+r+"/"+p+"\n"+"\n"+
                    
                                        "or    "+p+"y ="+q+"x -"+r); 
                                        
                                        
                                h=hcf(p,q,r);
                                p=p/h;
                                q=q/h;
                                r=r/h;
                                        
                                        
                                System.out.println("_____________________________");
                                if((p==1)&&(q==1)&&(r==1))
                                System.out.println("or    y = x -1");
                                
                                else if((p==1)&&(q==1)&&(r!=1))
                                System.out.println("or     y = x -"+r);
                                
                                else if((p==1)&&(q!=1)&&(r==1))
                                System.out.println("or    y ="+q+"x -"+1);
                                
                                else if((p!=1)&&(q==1)&&(r==1))
                                System.out.println("or    "+p+"y = x -"+1);
                                
                               else if((p==1)&&(q!=1)&&(r!=1))
                                System.out.println("or    y ="+q+"x -"+r);
                                
                                else if((p!=1)&&(q==1)&&(r!=1))
                                System.out.println("or    "+p+"y = x -"+r);
                                
                                else if((p!=1)&&(q!=1)&&(r==1))
                                System.out.println("or    "+p+"y ="+q+"x -"+1);
                                
                                else
                                System.out.println("or    "+p+"y ="+q+"x -"+r);
                                System.out.println("_____________________________");
                                        
                                        
                                        
                                        
                         }
                     }
                  
                    else
                       {
                          if((m*a)>0)
                         {
                              System.out.println("y = "+"-"+q+"/"+p+"x +"+r+"/"+p+"\n"+"\n"+
                    
                                        "or    "+p+"y = -"+q+"x +"+r);  
                                        
                                h=hcf(p,q,r);
                                p=p/h;
                                q=q/h;
                                r=r/h;
                                        
                                        
                                System.out.println("_____________________________");
                                if((p==1)&&(q==1)&&(r==1))
                                System.out.println("or   y = -x +1");
                                
                                else if((p==1)&&(q==1)&&(r!=1))
                                System.out.println("or     y = -x +"+r);
                                
                                else if((p==1)&&(q!=1)&&(r==1))
                                System.out.println("or    y = -"+q+"x +"+1);
                                
                                else if((p!=1)&&(q==1)&&(r==1))
                                System.out.println("or    "+p+"y = -x +"+1);
                                
                                else if((p==1)&&(q!=1)&&(r!=1))
                                System.out.println("or    y = -"+q+"x +"+r);
                                
                                else if((p!=1)&&(q==1)&&(r!=1))
                                System.out.println("or    "+p+"y = -x +"+r);
                                
                                else if((p!=1)&&(q!=1)&&(r==1))
                                System.out.println("or    "+p+"y = -"+q+"x +"+1);
                                
                                else
                                System.out.println("or    "+p+"y = -"+q+"x +"+r);
                                System.out.println("_____________________________");
                                        
                         }
                         
                         else
                         {
                              System.out.println("y = "+"-"+q+"/"+p+"x -"+r+"/"+p+"\n"+"\n"+
                    
                                        "or    "+p+"y = -"+q+"x -"+r); 
                                        
                                        
                                h=hcf(p,q,r);
                                p=p/h;
                                q=q/h;
                                r=r/h;
                                        
                                        
                                System.out.println("_____________________________");
                                if((p==1)&&(q==1)&&(r==1))
                                System.out.println("or    y = -x -1");
                                
                                else if((p==1)&&(q==1)&&(r!=1))
                                System.out.println("or     y = -x -"+r);
                                
                                else if((p==1)&&(q!=1)&&(r==1))
                                System.out.println("or    y =-"+q+"x +"+1);
                                
                                else if((p!=1)&&(q==1)&&(r==1))
                                System.out.println("or    "+p+"y = -x -"+1);
                                
                               else if((p==1)&&(q!=1)&&(r!=1))
                                System.out.println("or    y = -"+q+"x -"+r);
                                
                                else if((p!=1)&&(q==1)&&(r!=1))
                                System.out.println("or    "+p+"y = -x -"+r);
                                
                                else if((p!=1)&&(q!=1)&&(r==1))
                                System.out.println("or    "+p+"y = -"+q+"x -"+1);
                                
                                else
                                System.out.println("or    "+p+"y = -"+q+"x -"+r);
                                System.out.println("_____________________________");
                                        
                         }
                     }
                }
          
            
            G.sketch(M,C);
           G.MarkPoint(A);
           G.MarkPoint(B);
           
           G.display();
        
            
            
            
            
            
            
            }        
        
   
  }


   void findGraph(String Eq)
   {
       boolean x,y;
       x=y=false;
       String st=Eq;
       int l=st.length();
       char ch;
       double a,b,c;
       int p,q,r;
      
       p=q=r=0;
       a=b=c=0;
       
       
       for(int i=0;i<l;i++)
       {
           ch=st.charAt(i);
           
           if(ch=='=')
           r=i;
           
           
           if(ch=='y'||ch=='Y')
           {  y=true; p=i;  }
           
           if(ch=='x'||ch=='X')
           {  x=true; q=i;  }
           
       }

       String w;
       
      
       
      if((y==true)&&(x==false)) 
     {
       if(p==0)
         a=1;
       else  
       {  w=st.substring(0,p);
           if(w.equals("-"))
           a=-1;
           
           else
           a=Double.parseDouble(w);
        }
        
           w=st.substring(r+1,l);
           c=Double.parseDouble(w);
           
           double cy=c/a;
           
           G.sketchX(cy);
           G.display();
           
           
           
        }
        
        
        if((x==true)&&(y==false)) 
     {
       if(p==0)
         a=1;
       else  
       {  w=st.substring(0,p);
           if(w.equals("-"))
           a=-1;
           
           else
           a=Double.parseDouble(w);
        }
        
           w=st.substring(r+1,l);
           c=Double.parseDouble(w);
           
           double cx=c/a;
           
           G.sketchY(cx);
           G.display();
           
           
           
        }
       
      
        
       
       
       
       
       
    else if((y==true)&&(x==true))
     {  
       if(p==0)
         a=1;
       else  
       {  w=st.substring(0,p);
           if(w.equals("-"))
           a=-1;
           
           else
           a=Double.parseDouble(w);
        }
        
        if(q==(r+1))
         b=1;
       else  
       {  w=st.substring(r+1,q);
           if(w.equals("-"))
           b=-1;
           
           else
           b=Double.parseDouble(w);
        }
        
        if(q==(l-1))
         c=0;
         
         else  
       {  w=st.substring(q+1,l);
           
           c=Double.parseDouble(w);
        }
        
        
        double M=b/a;
        double C=c/a;
        
        G.sketch(M,C);
        G.display();
      
    }
  }

  
  void askPen()throws IOException 
  {
      
      
      System.out.println("_______________________________________________________"+"\n"+
                         "       PEN STYLES------                                "+"\n"+
                         "-------------------------------------------------------"+"\n"+
                         "  PRESS 1 ---->     #####################              "+"\n"+"\n"+
                         
                         "  PRESS 2 ---->     @@@@@@@@@@@@@@@@@@@@@              "+"\n"+"\n"+
                         
                         "  PRESS 3 ---->     *********************              "+"\n"+"\n"+
                         
                         "  PRESS 4 ---->     XXXXXXXXXXXXXXXXXXXXX              "+"\n"+"\n"+
                         
                         "  PRESS 5 ---->     OOOOOOOOOOOOOOOOOOOOO              "+"\n"+"\n"+
                         
                         "  PRESS 6 ---->     %%%%%%%%%%%%%%%%%%%%%              "+"\n"+"\n"+
                         
                         "  PRESS 7 ---->     +++++++++++++++++++++              "+"\n"+
                         "_______________________________________________________");
                         
            String st="";
              
               try
               {
               int a=Integer.parseInt(br.readLine());
              
              switch(a)
              {
                  case 1: st="##";break;
                  case 2: st="@@";break;
                  case 3: st="**";break;
                  case 4: st="XX";break;
                  case 5: st="OO";break;
                  case 6: st="%%";break;
                  case 7: st="++";break;
                  default: 
                          { 
                              System.out.println("WRONG INPUT!!!!-----try Again---");
                              askPen();
                            }
                }
                
            }catch(NumberFormatException e)
            {
                System.out.println("WRONG INPUT!!!!-----try Again---");
                              askPen();
                            }
                G.pen=st;
            }
                        
                  
                  
                  
  
  
  
  double x,y,x2,y2;
    String nm,nm2,Eq;
    
    Point P,P1,P2;
    
  InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    
    int a;
    
                  private Point askPoint()throws IOException
                 {
                           System.out.println("Enter the Point...");
                            
                            System.out.println("Name of point..?       e.g.-- A,B,C..or..X,Y---etc");
                             nm=(br.readLine());
                            System.out.println("X-coordinate...?");
                             x=Integer.parseInt(br.readLine());
                            System.out.println("Y-coordinate..?");
                             y=Integer.parseInt(br.readLine());
                             
                             
                             if((x<=-25)||(x>=25)||(y<=-25)||(y>=25))
                             {
                                 System.out.println("ERROR!!!!....Point out of Graph Range---(-25<x<25),(-25<y<25)....try again---");
                                 askPoint();
                                }
                             Point P=new Point(nm,x,y);
                             
                             return(P);
                            }
                             
    
        
        
        
      private void PROCESS(int n)throws IOException
       {
           int a=n;
        switch(a)
        {
            case 1: 
                    {   
                        String p;
                        p="C";
                        while(p.equalsIgnoreCase("C"))
                        {
                            
                            

                            
                            P=askPoint();
                            
                            
                            G.MarkPoint(P);
                            G.display();
                            
                            
                            System.out.println("PRESS C to Continue.........."+"\n"+
                                               "PRESS R to Reset the graph..."+"\n"+
                                               "PRESS X to go back..........."+"\n");
                            p=(br.readLine());
                            
                            if(p.equalsIgnoreCase("R"))
                            {
                                G.reset();
                                G.display();
                                p="C";
                            }
                        }
                   
                        System.out.println("Do you want to Reset the graph before going back....."+"\n"+
                                           "PRESS Y to yes or/ N to No....."+"\n");
                         p=(br.readLine());    
                         
                         if(p.equalsIgnoreCase("y"))
                         {
                             G.reset();
                             G.display();
                            }
                         
                         
                        ask();
                    
                    
                    
                    }break;
                    
                    
                    case 2:
                          {
                                P1=askPoint();
                                P2=askPoint();
                            
                            findDistance(P1,P2);
                            
                            G.reset();
                            ask();
                        }break;
                        
                        case 3:
                          {
                               Point P1=askPoint();
                               Point P2=askPoint();
                            findMidPoint(P1,P2);
                            
                            G.reset();
                            ask();
                        }break;
                        
                        
                        case 4:
                          {
                               P1=askPoint();
                               P2=askPoint();
                            
                            findSlope(P1,P2);
                            
                            G.reset();
                            ask();
                        }break;
                            
                            
        
                        case 5:
                        {
                           
                        
          
                        String p;
                        p="C";
                        while(p.equalsIgnoreCase("C"))
                        {
                             System.out.println("Enter the equation of line...(of form y=mx+c)");
                            Eq=(br.readLine());
                            
                            findGraph(Eq);
                        
                            

                            
                           
                            
                            
                            System.out.println("PRESS C to Continue.........."+"\n"+
                                               "PRESS P to change Pen Style.."+"\n"+
                                               "PRESS R to Reset the graph..."+"\n"+
                                               "PRESS X to go back..........."+"\n");
                            p=(br.readLine());
                            
                            if(p.equalsIgnoreCase("R"))
                            {
                                G.reset();
                                G.display();
                                p="C";
                            }
                            
                            else if(p.equalsIgnoreCase("P"))
                            {
                                askPen();
                                p="C";
                            }
                            
                        }
                   
                        System.out.println("Do you want to Reset the graph before going back....."+"\n"+
                                           "PRESS Y to yes or/ N to No....."+"\n");
                         p=(br.readLine());    
                         
                         if(p.equalsIgnoreCase("y"))
                         {
                             G.reset();
                             G.display();
                            }
                         
                         
                        ask();
                    
                    
                    
                    }break;
        
        
                    case 6:
                          {
                               P1=askPoint();
                               P2=askPoint();
                            
                            findEquation(P1,P2);
                            
                            G.reset();
                            ask();
                        }break;
        
        
                        case 7:
                        {
                            askPen();
                            ask();
                        }break;
                          
                        case 8:;break;
                         default:
                        {
                         System.out.println("WRONG INPUT....TRY AGAIN..");
                         ask();
                        }
                        
        
       }
   }
   
   
   
   void ask()throws IOException
     {
      try
      {
      System.out.println("-------------------------------------------------------------------"+"\n"+
                         "PRESS 1 to locate point(s) on Graph..................."+"\n"+
                         "PRESS 2 to find distance b/w two points..............."+"\n"+
                         "PRESS 3 to find MidPoint b/w two points..............."+"\n"+
                         "PRESS 4 to find Slope b/w two points.................."+"\n"+
                         "PRESS 5 to Draw graph of line(s)......................"+"\n"+
                         "PRESS 6 to find Equation of line between two points..."+"\n"+
                         "PRESS 7 to change Pen Style..........................."+"\n"+
                         "PRESS 8 to Exit......................................."+"\n"+
                         "___________________________________________________________________");
                         
        a=Integer.parseInt(br.readLine());
        PROCESS(a);
    }
        
    catch(NumberFormatException e)
    {
       System.out.println("WRONG INPUT....TRY AGAIN..");
                         ask();
                        }
   
}
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


        