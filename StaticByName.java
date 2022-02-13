class StaticDemo{
static int a =42;
static int b = 98;

static void Callme(){
System.out.println("a = " +a);
}
}

class StaticByName{
public static void main(String args[]){
StaticDemo.Callme();
System.out.println("b  = " + StaticDemo.b);
}
}
