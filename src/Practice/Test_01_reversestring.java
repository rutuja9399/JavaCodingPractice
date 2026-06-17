package Practice;

import java.util.Scanner;

public class Test_01_reversestring {
    public static void main(String[] args) {
        String str = "rutuj  ";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char temp = str.charAt(i);
            rev = rev + temp;
        }
        System.out.println("reverse string " + rev);
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("palindrome:  " + rev);
        } else {
            System.out.println("notPalindrome:  " + rev);
        }
        //to check the blank spaces in string
        int counter =0;
        for(int i=0; i<=str.length()-1;i++)
        {
            char t =str.charAt(i);
            if(t== ' '){
                counter++;
                        }
        }
        System.out.println(counter);
        //to check the string length
        int counter1 =0;
        for(int i =0; i<str.length(); i++)
        {
counter1++;
        }
        System.out.println(counter1);

        //to check the variable count how many time comes in string
        int count =0;
        for(int i=0; i<=str.length()-1; i++)
        {
            char b = str.charAt(i);
            if(b =='u')
            {
                count++;
            }
        }
        System.out.println(count);

    }

}
