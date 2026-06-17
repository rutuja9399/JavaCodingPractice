package starProgram_practice;

public class Triangle_pattern {
    public static void main(String[] args) {
//        1
//        22
//        333
//        4444
//        55555
        int row =5;
        int star =1;
        for(int i=1; i<=row;i++){
            for(int j=1; j<=star; j++)
            {
                System.out.print(star);
            }
            System.out.println();
            star++;
        }

    }
}
