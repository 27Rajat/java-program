// java program to get the cube of a given number using static function

class Calculate{
static int cube(int x){
return x*x*x;
}

public static void main(String args[]){
int result = Calculate.cube(5);
System.out.println(result);
}
}
