package methodStudy;

public class MethodWithPara {
    public static void main(String[] args) {
      MethodWithPara p = new MethodWithPara();
      p.m1();
      m2();
      m3();
      m4("Nashik");
    }
    public void m1()
    {
        System.out.println("M1 regular method");
    }
    public static void m2()
    {
        System.out.println("M2 is static regular method");
    }
    public static void m3(){//
        int a = 10;
        int b= 20;
        int c = a+b;
        System.out.println(c);
    }
    public static void m4(String cName){
        System.out.print("City name is:"+cName);
    }

}
