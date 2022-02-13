class  StudentThis{
int rollno;
String name, course;
float fee;
StudentThis(int rollno,String name , String course)
{
this.rollno = rollno;
this.name = name;
this.course=course;
}
StudentThis(int rollno, String name , String course,float fee)
{
this(rollno,name,course); //reusing constructor 
this.fee=fee;
}
void display(){
System.out.println(rollno + " " + name +" " + course +" " + fee);
}
}

