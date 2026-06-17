package abstractStudy;

public class B extends A{
    public static void main(String[] args) {

        B b = new B();
        b.call();
        b.val();
        A.ball();
    }
    public void call()
    {
        System.out.println("abtract method from class B");
    }
}
