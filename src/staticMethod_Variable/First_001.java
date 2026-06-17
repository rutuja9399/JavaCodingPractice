package staticMethod_Variable;

public class First_001 {
    String s = "rutuja";
    static String name = "yashraj";

    public void getdata(){
        String s = "abhi";
        System.out.println(s);
        System.out.println( this.s);
    }
    public static void main(String[] args) {
        First_001 ff = new First_001();
        System.out.println(name);
        ff.getdata();
    }
}
