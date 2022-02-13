import java.util.Scanner;
class Sum{
public void sum(int n)
{
int sum =0;
while(n>0)
{
sum =sum +n%10;
n = n/10;
}
System.out.println("sum of number are :"+ sum);
}
}

class TestSum{
public static void main(String args[])
{

Scanner in = new Scanner(System.in);
System.out.print("input the first number: ");
int n  =  in.nextInt();
Sum s = new Sum();
s.sum(n);
}
}

