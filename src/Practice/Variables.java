package Practice;

public class Variables {
    int a; //initialization & declare of global variable  or instance variable
    static int b=20;
     public void m1()
     {
        int a=10;
        System.out.println("local variable a :"+a);
        //we cannot get output of local variable with only initialization
     }
public static void m2(){

         System.out.println("static vaiable b: "+b);
}
    public static void main(String[] args) {
        Variables v = new Variables();
        int b =v.a;
         v.m1(); //non static method
        System.out.println("global variable value:"+b);
        //We get outpout as zero in gloal variable without initialize value to it.
        m2(); //static method

    }



}
