
class counter{
public static void CD(int n){
if(n <  0)
return ;

System.out.println("The num is :" + n);
CD(n-1);
}
}
class counter1{
public static void main(String args[])
{
counter s = new counter();
s.CD(10);
}
}
