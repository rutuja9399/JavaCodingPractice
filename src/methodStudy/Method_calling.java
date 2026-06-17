package methodStudy;

public class Method_calling {
    public static void main(String[] args) {
        //heart of the class is main class
        //to call the static method in the main class we need to call it by method name
        m1();
        m2();

    }
    public static void m1()
    {
        System.out.println("To execute method we need to run it in the main method");
    }
    public static void m2()
    {
System.out.println("m2 is running");
    }
    public static void m3() {
        System.out.println("No one calling me in main method so, I am not running in terminal");
    }
}
