class fibonacci{
public static void main(String args[]){
int i ,n = 8 ,f1 = 1, f2 = 1, nextterm;

for(i =1 ; i <=n ; ++i)
{
System.out.println("fibonacci value is  = " + f1);
nextterm = f1 + f2 ;
f1 = f2;
f2 = nextterm;
}
}
}
