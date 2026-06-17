package exceptionHandling;

public class ExceptionTryCatchFinally {
    public static void main(String[] args) {
        String n = null;
        try{
            System.out.println(n.length());
        }catch(Exception e){
            System.out.println("string should not null");
        }
        finally {
            System.out.println("Something went wrong" );
        }
        System.out.println("end of code");
    }

}
