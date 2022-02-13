class Sphere{
public static void main(String args[]){

int r = 5;
int d= r*2;
System.out.println("The diameter of sphere is" + d);

double circumference = 2*Math.PI*r;
System.out.println("The circumference of sphere is" + circumference);

double SA = 4*Math.PI* r*r;
System.out.println("The Surface Area of sphere is" + SA);

double v = 4/3*Math.PI*r*r;
System.out.println("The volume of sphere is" + v);
}
}
