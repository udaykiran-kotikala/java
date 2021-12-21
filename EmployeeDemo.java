import java.util.*;
class Employee
{
String name;
int ID;
double Salary;
float hours;
void getInfo( )
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter name of the employee:");
                name=sc.nextLine();
System.out.println("Enter employee id:");
ID=sc.nextInt();
System.out.println("Enter employee salary:");
Salary=sc.nextDouble();
System.out.println("Enter numbers of hours employee worked:");
hours=sc.nextInt();
}
void addSal()
{
if(Salary<500.0)
{
Salary=Salary+10.0;
}
}
void addWork()
{
if(hours>6)
{
Salary=Salary+5.0;
}
}
void display()
{
System.out.println("The final salary of "+name+","+ID+":"+Salary);
}
}
class EmployeeDemo
{
public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter number of employee:");
int n=sc1.nextInt(),i;
Employee[] arr=new Employee[n];  
for(i=0;i<n;i++)
{

arr[i]=new Employee();
arr[i].getInfo( );
arr[i].addSal();
arr[i].addWork();
}
for(i=0;i<n;i++)
{
arr[i].display();
}
}
}

