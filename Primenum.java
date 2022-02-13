import java.util.Scanner;
class Primenum
{
static int Primeornot(int num)
{
int count=0;
for(int i=1;i<num;i++){
if(num%i==0){
count++;
}
}
return count;
}
public static void main(String args[])
{
Scanner i=new Scanner(System.in);
System.out.println("Enter a number");
int num=i.nextInt();
int j=Primeornot(num);
if(j==1){
System.out.println(num+"is prime");
}
else{
System.out.println(num+"is not prime");
}


}
}