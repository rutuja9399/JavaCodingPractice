package thisKeyword;

public class SecondClass
{
    int a = 8;
    public void data ()
    {
        int a =5;
        System.out.println(a);
        System.out.println(this.a);
        int b = a+ this.a;
        System.out.println(b);
    }
    public static void main(String[] args) {
      SecondClass s = new SecondClass();
      s.data();
    }
}
