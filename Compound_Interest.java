class Compound_Interest{
public static void main(String args[]){

double principle = 10000;
double rate = 10.25;
double time = 5;

double Amount = principle * (Math.pow((1+rate /100), time));
double CI = Amount - principle;
System.out.println("The compound interest is : " + CI);
}
}
