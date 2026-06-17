package exceptionHandling;

import java.util.TreeMap;
import java.util.TreeSet;

public class Exception_classcast {
    public static void main(String[] args) {
        TreeSet<Object>set = new TreeSet();
        set.add(1);
        set.add(3);
        try{
            set.add("String");
        } catch (ClassCastException e) {
            System.out.println("set allow homogenous data only");
        }
    }
}
