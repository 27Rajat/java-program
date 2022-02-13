class Student1  {
    public String Name;
    public int Marks;

    public void get(String name,int marks) {

        Name = name;
        Marks = marks;
        
    }
    public void print() {
        System.out.println("NAME : " + Name );
        System.out.println("MARKS : " + Marks );
    }
    
}
class Result{
    public static void main(String args[]) {
        Student1 s = new Student1();
        s.get("Rajat",100);
        s.print();
    }
}


