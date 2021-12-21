//variable length arguments
class Var
{  
static void display1(int n,String... x)
{
System.out.println("number is "+n);  
System.out.println("display method invoked ");  
for(String s:x)
{  
System.out.println(s);  
}
  
}
}
class varargs
{  
public static void main(String args[])
{  
Var.display1(3);   
Var.display1(3,"hello");
Var.display1(12,"my","name","is","uday"); 
}   
}  
      