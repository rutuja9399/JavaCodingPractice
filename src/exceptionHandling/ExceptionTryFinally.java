package exceptionHandling;

import com.sun.tools.javac.Main;

public class ExceptionTryFinally {
    public static void main(String[] args) {
        int a = 6;
        int b=0;
        try{
            //risky code
            System.out.println(b/a);
        }finally {
            System.out.println("hi there finally");
        }
        System.out.println("am i going to excute without exception after finally?" +
                " : answer is yes");

        System.out.println("****************");
        try{
            //risky code
            System.out.println(a/b);
        }finally {
            System.out.println("hi there finally");
        }
        System.out.println("am i going to excute with exception after finally?" +
                " : answer is no");

    }
}
