import java.util.*;
class student
{
String name,rollno;
void info()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the student name");
String n=sc.nextLine();
System.out.println("enter the student roll no");
String r=sc.nextLine();
name=n;
rollno=r;
}
}
class test extends student
{
float sa,t,e,m,s,c;
void read()
{
Scanner d=new Scanner(System.in);
System.out.println("enter your english marks");
 e=d.nextFloat();
System.out.println("enter your math marks");
 m=d.nextFloat();
System.out.println("enter your science marks");
 s=d.nextFloat();
System.out.println("enter your sanskrit marks");
 sa=d.nextFloat();
System.out.println("enter your telugu marks");
 t=d.nextFloat();
System.out.println("enter your c marks");
 c=d.nextFloat();
}
}
class result extends test
{
float result;
void get()
{
read();
result=e+m+s+sa+t+c;
System.out.println("the result is"+result);
}
}
class week_4_2
{
public static void main(String args[])
{
int j;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of students");
int m=sc.nextInt();
result[] re=new result[m];
for(j=0;j<m;j++)
{
re[j]=new result();
re[j].info();
re[j].read();
re[j].get();
}
}
}