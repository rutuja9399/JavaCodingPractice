package constructor_Study;

public class Study2 {
    int a =8;
    int b=9 ;
    //declare global variable

    public  Study2()
    {
int x=a;
int y=b;
int sum = x+y;
System.out.println("The sum of number:"+sum);
    }
    public Study2(int c, int d){
      int sum= c+d;
      System.out.println(sum);
    }
    public static void main(String[] args) {
Study2 st = new Study2();
Study2 st1 = new Study2(45,54);

    }

}
