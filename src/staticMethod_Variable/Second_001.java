package staticMethod_Variable;

public class Second_001 {
    static String address= "Banglore";
    public static void m1(){
        System.out.println(address);
        System.out.println("static method m1");
    }
    public void m2()
    {
        System.out.println("Non static method m2");
    }
    public Second_001(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Second_001 ss = new Second_001();
        ss.m2();
        m1();
      //  System.out.println(address);
    }
}
