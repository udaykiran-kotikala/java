import java.util.Scanner;
class figure
{ 
  int dim1,dim2;
  void input()
  {
     System.out.println("enter dimension-1:");
     Scanner p=new Scanner(System.in);
     dim1=p.nextInt();
     System.out.println("enter dimension-2:");
     dim2=p.nextInt();
  }
  void area()
  {
      System.out.println("area of the figure will be calculated");
   }
}
class triangle extends figure
{   
    double a;
    void area()
     {
        a=(0.5)*(dim1)*(dim2);
        System.out.println("area of triangle is "+a);
     }
}
class rectangle extends figure
{
    double a;
    void area()
     {
         a=dim1*dim2;
          System.out.println("area of rectangle is "+a);
     }
}
class week_5_2
{
    public static void main(String args[])
   {
    System.out.println("on creating object for figure class:");
    figure f=new figure();
    f.area();
    System.out.println("on creating object for trianlge class:");
    triangle t=new triangle();
    t.input();
    t.area();
    System.out.println("on creating object for rectangle class:");     
    rectangle r=new rectangle();
    r.input();
    r.area();
   }
}