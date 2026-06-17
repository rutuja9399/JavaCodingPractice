package exceptionHandling;

public class Exception_indexoutofbound {
    public static void main(String[] args) {
        int arr [] ={10,30,50,30};
        System.out.println("length od array: ");
        System.out.println(arr.length);
        try{
            System.out.println(arr[4]);

        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("fourth index not there");
        }
//=========================================
        String st ="automation";
        try{
            System.out.println(st.charAt(12));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("12 th numnber character not there");
        }

    }
}
