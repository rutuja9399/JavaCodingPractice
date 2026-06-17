package customizedException;

public class SeniorCitizenException {
    public static void main(String[] args) {
        int age = 77;
        if(age<=65){
            throw new AgeException("Age should be greater than eqaul to 65");
        }
        else{
            System.out.println("Age is correct");
        }

        System.out.println("********************");
        System.out.println();
        System.out.println();
        int age1 = 57;
        if(age1<=65){
            throw new AgeException("Age should be greater than eqaul to 65");
        }
        else{
            System.out.println("Age is correct");
        }
    }
}
