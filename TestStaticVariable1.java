 // test to show the values of objects 

 public class TestStaticVariable1
 {
     public static void main(String args[])
     {
         Student2 s1 = new Student2(111, "Rajat");
         Student2 s2 = new Student2(222, "Harshit");

         // we can change the college of all objects by the single linbe of code

         //Student2.college = "Amity";

        s1.display();
        s2.display();
     }
 }