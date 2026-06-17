package superKeyword;

public class CHildDemo extends PArentDemo{
    String name ="Rutuja";
     String name1 ="ryp";
    public void demo( )
    {
        System.out.println(name);

        System.out.println(super.sname);

    }
    public void getDemo(){
        //to invoke same getdemo method from parentdemo we will use super keyword
        super.getData();

        System.out.println("i am from child");
    }
    public CHildDemo(){
        //i ma calling parendemo construcotr here for that we have super keywokr
        super();
        System.out.println("I am CHild demo constructor");
    }
    public static void main(String[] args) {
        CHildDemo ch = new CHildDemo();
        ch.demo();
        ch.getDemo();
    }
}
