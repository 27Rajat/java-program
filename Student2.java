class Student2{
    int rollno; // instannce variable
    String name;
    static String college ="ITS"; // static variable

    // constructor
    Student2(int r, String n){
        rollno = r;
        name = n;
    }

    // method to display the values 
    void display()
    {
        System.out.println(rollno + " " + name + " " + college);
    }
}
