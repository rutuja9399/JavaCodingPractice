package exceptionHandling;

import java.nio.channels.ScatteringByteChannel;

public class Exception_nullpointer {
    public static void main(String[] args) {
        String st =null;
        try{
            System.out.println(st.length());
        }
        catch(NullPointerException e){
            System.out.println("string should not null");
        }
    }
}
