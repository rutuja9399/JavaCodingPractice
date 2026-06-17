package constructorPractice;

public class CChain {
    int ii=9;
    public CChain()
    {
        this(10);
        System.out.println("Output of first : ");
    }
    public CChain(int i)
    {

        this("hello");
        System.out.println("Output of second: "+i);
    }
    public CChain (String ss)
    {
       System.out.println("Output of third: "+ss);
    }

    public static void main(String[] args) {
CChain cc = new CChain();
    }
}
