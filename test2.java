class  Employee{
int icno;
String name;
float salary;
Employee(int icno,String name )
{
this.icno = icno;
this.name = name;
}
Employee(int icno, String name , float salary)
{
this(icno,name); //reusing constructor 
this.salary=salary;
}
void display(){
System.out.println(icno + " " + name + " " + salary);
}
}

class test2{
public static void main(String args[]){
Employee E1 = new Employee(111,"Rajat");

Employee E2 = new Employee(222,"Harshit",80000f);
E1.display();
E2.display();
}
}
