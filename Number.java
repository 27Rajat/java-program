public class Number {
    static double a;

    Number(double x) {
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
    boolean isPositive() {
        if (a > 0){
            return true;
         }
         else{
        return false;
    }

    }

    boolean isNegative() {
        if (a < 0)
           {
            return true;
         }
          else{
        return false;
    }

    }

    boolean isOdd() {
        if (a % 2 != 0){
            return true;
         }
          else{
        return false;
    }

    }

    boolean isEven() {
        if (a % 2 == 0)
         {
            return true;
         }
          else{
        return false;
    }

    }

    public static void main(String args[]) {
        Number ob1 = new Number(3.14);
       
        boolean p = ob1.isZero();
        boolean q = ob1.isPositive();
        boolean r = ob1.isNegative();
        boolean s = ob1.isEven();
        boolean t = ob1.isOdd();
        if (p  == true) {
            System.out.println(a + "Is zero");
        }
        if (q == true) {
            System.out.println(a + "Is positive");
        }
         if (r == true) {
            System.out.println(a + "Is negative");
        }
        if (s == true) {
            System.out.println(a + "Is even");
        }
         if (t == true) {
            System.out.println(a + "Is odd");
        }
    }

}
