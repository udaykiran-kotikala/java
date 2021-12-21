import java.util.Scanner;
class outer
{
    int outer_x;
class inner
{
void display()
{
System.out.println("You entered:"+outer_x);
}
}
void test()
{
System.out.println("Outer class");
System.out.println("Test method called in outer class");
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to Display:");
   outer_x=sc.nextInt();
   System.out.println("Creating an instance for inner method");
inner i=new inner();
System.out.println("Calling Display function in inner class");
i.display();
}
}
 class inner_class
{
public static void main(String args[])
{
System.out.println("Creating an instance for outer class");
outer o=new outer();
System.out.println("Calling test method of outer class");
o.test();
}
}