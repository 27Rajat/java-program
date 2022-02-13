import java.util.Scanner;

class Count{
boolean isprime(int n )
{
if(n<=1)
return false;

for(int i =2; i<n; i++)
{
    if(n%i==0)
    {
    return false;
    }

}
return true;
}

int countprime(int n){
    int cnt=0;
    for(int i =2; i<n; i++)
    {
    if(isprime(i))
    {
        cnt++;
    }

    }
    return cnt;
}

}
class test3{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the value of n : ");
        int n = scan.nextInt();

       Count c = new Count();
       c.isprime(n);

int ans = c.countprime(n);
 
System.out.println("The total num of prime num are : " + ans);
}
}
