package Practice;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Rutuja";
        String reversename = "";

        for(int i=name.length()-1; i>=0; i--)
        {
            char c = name.charAt(i);
            reversename=reversename+c;
        }
        System.out.println(reversename);
    }
}
