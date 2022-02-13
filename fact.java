class recursion{
int Factorial(int n){
int res;
if (n == 1) return 1;
res = Factorial(n-1)*n;
return res;
}
}
class fact{
public static void main(String args[]){
recursion f = new recursion();
System.out.println("Factorial of 5 is : " + f.Factorial(5));
}
}
