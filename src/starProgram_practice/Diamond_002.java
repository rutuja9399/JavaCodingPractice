package starProgram_practice;

public class Diamond_002 {
    public static void main(String[] args) {

        int ro =5;
        int space=4;
        int star=1;
         for(int i=1; i<=ro; i++)
         {
             for( int j=1;j<=space; j++){
                 System.out.print(" ");
             }
             for(int k=1; k<=star; k++){
                 System.out.print("* ");
             }
             System.out.println();
             space--;
             star++;

         }
         int row=4;
         int space1=0;
         int star1=4;

        for(int a=1; a<=row; a++)
        {
            for( int b=1;b<=space1; b++){
                System.out.print(" ");
            }
            for(int c=1; c<=star1; c++){
                System.out.print(" *");
            }
            System.out.println();
            space1++;
            star1--;

        }
    }

}
