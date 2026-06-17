package star_program;

public class Program_001 {
    public static void main(String[] args) {
        //need to prinyt star 1 by 1
        for(int i=1; i<=5; i++)
        {
            System.out.println("*");
        }
        System.out.println("--------------------------");

        //want to print star in same line
        for(int i=1; i<=5; i++)
        {
            System.out.print("*");
        }
        System.out.println(  );
        System.out.println("--------------------------");
//to give space after every star

        for(int i=1; i<=5; i++)
        {
            System.out.println("* ");
        }
    }
}
