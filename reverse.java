class reverse {
public static void Rev(int n)
{
if (n < 10) {
System.out.println(n);
return;
}
else { 
System.out.print(n % 10 );
Rev(n / 10);
}
}
public static void main(String args[])
{
int n = 282719; 
System.out.print(" after reversing " );
Rev(n);
}
}
