class Cylinder{
public static void main(String args[]){

int r = 4;
int h = 2;

double Circumference = 2* Math.PI* r;
System.out.println("the circumference of the cylinder is : " + Circumference);

double CSA = 2* Math.PI* r* h;
System.out.println("the CSA of the cylinder is : " + CSA);

double TSA = 2*Math.PI*r*(h+r);
System.out.println("the TSA of the cylinder is : " + TSA);
 
double V  = Math.PI*r*r*h;
System.out.println("the volume of the cylinder is : " + V);
 
}
}
