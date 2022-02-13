class Area{
int area(int len , int bre)
{
return len * bre;
}
int area(int side)
{
return side * side;
}
int area(float heig ,float bre)
{
return 1/2*heig * bre;
}
}
class test4{
public static void main(String args[]){

Area A = new Area();
int a = A.area(4,6);
System.out.println("The area of rectangle: " + a);
int b =  A.area(5); 
System.out.println("The area of square: " + b);
int c = A.area(5.2,6.2);
System.out.println("The area of triangle: " + c);

}
}
