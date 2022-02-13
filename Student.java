public class Student {
public String name;
private int marks;

public Student( String stuName ){
name = stuName;
}
public void setMarks(int stuMar)
{
marks = stuMar;
}

// this method print the student details
public void printStu(){
System.out.println("Name: " + name);
System.out.println("Marks: " + marks); 
}
public static void main(String args[]){
Student StuOne = new Student("Rajat");
Student StuTwo = new Student("Ram");
Student StuThree = new Student("Harshit");

StuOne.setMarks(98);
StuTwo.setMarks(89);
StuThree.setMarks(100);

StuOne.printStu();
StuTwo.printStu();
StuThree.printStu();

}
}
