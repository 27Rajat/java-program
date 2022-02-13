class Counter {
static int count = 0;

Counter(){
count++;  // increnmenting value
System.out.println(count);
}

public static void main(String args[]){

// creating objects 
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();
}
}
