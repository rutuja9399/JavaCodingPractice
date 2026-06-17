package methodStudy;

public class Static_Method {
    public static void run()
    {
        System.out.println("static method run");
    }
    public void fun()
    {
        System.out.println("not static method fun");
    }

    public static void main(String[] args) {
        //to call static method we need to directly call by its method name in same class
        run();

        //To call non-static method in same class we need to make object of class
         //ClassName objectName = New objectName ();
        Static_Method sm1 = new Static_Method();
        sm1.fun();

  }
}
