class Prime{
boolean  isprime(int n)
{
if(n<=1)
{
return false;
}

for(int i =2; i<n  ;i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}
}
class TestPrime{
public static void main(String args[])
{
int n= 7 ;

Prime p = new Prime();
System.out.println("element is prime : " + p.isprime(n));

}
}
