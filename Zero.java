public class Zero {
    static double a;

    Zero(double x) {
        a = x;
    }

    boolean isZero() {
        if (a == 0){
            return true;
         }
        else{
        return false;
    }
}
public static void main(String args[]) {
Zero ob1 = new Zero(3.14);
System.out.println("the num is zerO : " + ob1.isZero());
}
}
