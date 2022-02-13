class Cone{
public static void main(String args[])
{

int r =4;
int l = 2;
int h = 8;

double CSA = Math.PI*r*l;
System.out.println("the CSA of cone is : " + CSA);

double TSA = Math.PI*r *(r+l);
System.out.println("the TSA of cone is : " + TSA);

double v = (Math.PI *r *r*h)/ 3;
System.out.println("the volume of cone is : " + v );
}
}
