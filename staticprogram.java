class test
{
static int a=3;
static int b;
static void obj(int x)
{
System.out.println("b="+b);
System.out.println("x="+x);

System.out.println("a="+a);
}
static
{
System.out.println("static blocked initilized");
b=a*4;
}
}
class staticprogram
{
public static void main (String[] args)
{
test.obj(12);
}
}