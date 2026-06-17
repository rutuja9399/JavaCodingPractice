package exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("is there arithmatic exception");
        }
        catch(NullPointerException e){
            System.out.println("nullException is there");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("STring indexOutOfBound");
        }
        System.out.println("end of code");
    }
}
