package accessModifier;

public class Test_1 {

    private void method_1()
    {
        System.out.println("private method");
    }
    void method_2()
    {
        System.out.println("default method");
    }
    protected  void method_3()
    {
        System.out.println("Protected method");
    }

    public  void method_4()
    {
        System.out.println("public method");
    }

    public static void main(String[] args) {
Test_1 tt = new Test_1();
tt.method_1();
tt.method_2();
tt.method_3();
tt.method_4();
    }
}
