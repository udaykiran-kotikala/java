import java.util.Scanner;
class time
{
int hours,min,sec;
time()
{
hours=00;
min=00;
sec=00;
}
time(int a)
{
hours=a;
min=0;
sec=0;
}
time(int a,int b)
{
    hours=a;
min=b;
sec=0;
}
time(int a,int b,int c)
{
hours=a;
min=b;
sec=c;
}
void display()
{
System.out.println("Time is "+hours+":"+min+":"+sec);
}
}
class constructor_overloading
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int h,m,s;
System.out.println("Enter hours");
h=sc.nextInt();
System.out.println("Enter minutes");
m=sc.nextInt();
System.out.println("Enter seconds");
s=sc.nextInt();
time t=new time();
time t1=new time(h);
time t2=new time(h,m);
time t3=new time(h,m,s);
System.out.println("no paramerter ->");
t.display();
System.out.println("one parameter ->");
t1.display();
System.out.println("one parameter ->");
t2.display();
System.out.println("three parameters ->");
t3.display();
}
}