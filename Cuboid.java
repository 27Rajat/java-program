class Cuboid{
public static void main(String args[]){
int b = 2;
int l = 4;
int h = 6;

double Perimeter = 4*(l+b+h);
System.out.println("the perimeter of the cuboid is : " + Perimeter);

double TSA  = 2*(l*b+b*h+h*l);
System.out.println("the TSA of the cuboid is : " + TSA);

double V = l*b*h;
System.out.println("the volume of the cuboid is : " + V);
}
}
