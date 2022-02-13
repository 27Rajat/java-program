
class Sum{
int sum =0;
int add(int n){
if(n == 0)
return 0;

return n+add(n-1);
}
}
class test{
public static void main(String args[])
{
Sum s = new Sum();
int ans = s.add(10);
System.out.println("The sum is :" + ans);
}
}
