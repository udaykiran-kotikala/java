import java.util.*;
class employee
{
    String name;
    int id;
    String designation;
    void reademp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter the employee name :");
        name=sc.next();
        System.out.printf("\nenter the employee id:");
        id=sc.nextInt();
        System.out.printf("\nenter the employee designation:");
        designation=sc.next();
    }
}
class salary extends employee
{
    int BP;
    int HRA;
    double DA;
    double PF;
    double NP;
    void readsal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("\nenter the basic pay of employee(BP): $");
        BP=sc.nextInt();
        System.out.printf("\nenter the house rent allowanceof employee(HRA): $");
        HRA=sc.nextInt();
        System.out.printf("\nenter the dearness allowance of the employee(DA): $");
        DA=sc.nextDouble();
        System.out.printf("\nenter the provident fund of the employee(PF): $");
        PF=sc.nextDouble();
    }
    void calsalary()
    {
        NP=(BP+HRA+DA)-PF;
    }
    void displaysal()
    {
        System.out.println("\nthe net pay of "+name+" of id "+id+" with designation "+designation+" is : $"+NP );

    }
}
class week_4_1
{
    public static void main (String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.printf("\nenter the number of employees:");
        int n=sc.nextInt();
        salary[] arr=new salary[n];
        for(i=0;i<n;i++)
        {
            arr[i]=new salary();
            arr[i].reademp();
            arr[i].readsal();
            arr[i].calsalary();
        }
        for(i=0;i<n;i++)
        {
            arr[i].displaysal();
        } 
    }
}
