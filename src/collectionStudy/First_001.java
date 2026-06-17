package collectionStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class First_001 {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();//simple way to create arraylist
        ArrayList<String> a2= new ArrayList<>(); // String type arraylist we can give any database
        ArrayList<Object> a3 = new ArrayList<>();//here we can take any type of datatypes  it is generic arryalist
        a3.add("Nashik");
        a3.add("Pune");
        a3.add(123);
        a3.add(true);
        a3.add(55.57f);
        a3.add('a');
        System.out.println(a3);
        a3.add(1,"Mumbai");
        System.out.println(a3);
        a3.remove(3); //for particular index
        System.out.println(a3);
        //////////////////////////////////////
        a3.addLast("Nanded");
        System.out.println(a3);
        a3.addFirst(897);//right shift
        System.out.println(a3);
//        a3.clear(); for empty  array
//        System.out.println(a3);

       Object clone = a3.clone();
       System.out.println(clone);

      boolean  result=clone.equals(a3);
        System.out.println(result);

        a3.add(2);
        System.out.println(a3);
        System.out.println(a3.equals(clone));

        System.out.println(a3.contains("Pune"));

        Object methodGet = a3.get(5);
        System.out.println("element at index 5:"+methodGet);

        int M1 = a3.indexOf("Mumbai");
        System.out.println(M1);
        a3.addLast("Mumbai");
        int M2 = a3.lastIndexOf("Abb");
        System.out.println(M2);

    }

}
