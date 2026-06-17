package constructorPractice;

public class CChain_1 extends CChain {

    public CChain_1()
    {
        this(5,"yasha");

       System.out.println("Base class constructor cchain1");
    }
    public CChain_1(int b, String str)
    {
        super(8);
        System.out.println("Base class parameterized constructor cchain1 "+b);
        System.out.println("Base class parameterized constructor cchain1 "+str);
    }

    public static void main(String[] args) {
       CChain_1 c = new CChain_1();
       // CChain cc= new CChain();
    }

}
