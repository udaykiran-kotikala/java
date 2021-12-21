import java.util.Scanner;
class var
{
 int a,b,c;
 void test(int a,int b,int c)
 {
  this.a=a;
  this.b=b;
  this.c=c;
 }
 void display()
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("c="+c);
 }
}
class method
{
	void google()
	{
		System.out.println("hello google");
	}
	void amazon()
	{
		System.out.println("hello alexa");
		this.google();
	}
}
class constructor
{
	constructor()
	{
		System.out.println("hello google");
	}
	constructor(int x)
	{
		this();
		System.out.println(+x);
	}
}
class this_key
{
 public static void main(String args[])
{ 
while(1>0)
 {
 	System.out.println("enter 1 to verify 'this referring to current class instane variable'");
 	System.out.println("enter 2 to verify 'this to invoke current class method'");
 	System.out.println("enter 3 to verify 'this to invoke current class constructor'");
        System.out.println("enter 4 to exit");
 	Scanner in=new Scanner(System.in);
 	int c=in.nextInt();
 	switch(c)
 	{
 	case 1: var n=new var();
                n.test(10,20,30);
                n.display();
                break;
        case 2: method o=new method();
                o.amazon();
                break;
        case 3: constructor p=new constructor(100);
                break;
}

}}}