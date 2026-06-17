package constructorPractice;

public class class_1 {
    int i =8;
static int j;
    public  class_1()
    {
       int i=6;
      int b=i+this.i;
      System.out.println("variable i with non parameterised constructor: "+i);
      System.out.println("print B: "+b);
    }
    public class_1(int i)
    {

      int c = i+this.i;
      System.out.println("Variable with parameterized constructor: "+i);
      System.out.println("print c: "+c);
    }
public static void m()
{
     j=8;
     int l = 5+5;
     System.out.println("global static variable: "+j);
     System.out.println("global static variable called in static method: "+l);
}
public void m1()
{
    j=7;
    int j=9;
    System.out.println("global j: "+j);
    System.out.println("static j: "+j);
}
    public static void main(String[] args) {
        class_1 cc= new class_1();
        int a= cc.i;
        m();
        cc.m1();
        class_1 cc1= new class_1(2);

        System.out.println("global variable: "+a);

    }
}
