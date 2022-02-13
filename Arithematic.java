class Arithematic {
public static void main(String arg[]){
int a=9;
int b=5;
sum(a,b);
diffrence(a,b);
mul(a,b);
div(a,b);
}
public static void sum(int a,int b)
{
int S=a+b;
System.out.println("Sum of two number:" + S);
}
public static void diffrence(int a,int b)
{
int d=a-b;
System.out.println("Diffrence of two number:" + d);
}
public static void mul(int a,int b)
{
int pro=a*b;
System.out.println("Product of two number:"+ pro);
}
public static  void div(int a,int b)
{
float div=a/b;
System.out.println("Division result of two number:" + div);
}
}