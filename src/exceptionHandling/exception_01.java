package exceptionHandling;

public class exception_01
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("cannot divisible by 0");
        }
    }
}
