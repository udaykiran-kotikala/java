import java.util.Scanner;
class room
{
  int l,b,area;
  void area()
  {
    System.out.println("no parameters passed");
    l=20;
    b=10;
    area=l*b;
    System.out.println("area of room is "+area);
  }
  void area(int len)
  {
    System.out.println("one parameters passed");
    l=len;
    b=10;
    area=l*b;
    System.out.println("area of room is "+area);
  }
  void area(int len,int bre)
  {
    System.out.println("two parameters passed");
    l=len;
    b=bre;
    area=l*b;
    System.out.println("area of room is "+area);
  }
}
class week_5_1
{
  public static void main(String[] args)
  {
    room obj=new room();
    obj.area();
    obj.area(10);
    obj.area(5,10);
  }
}