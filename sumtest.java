class Sum{
int sum =0;
int add(int n){
xfor(int i=1;i<n;i++)
{
sum = sum +i;
}
return sum;
}
}
class sumtest{
public static void main(String args[])
{
Sum s = new Sum();
int ans = s.add(10);
System.out.println("The sum is :" + ans);
}
}

