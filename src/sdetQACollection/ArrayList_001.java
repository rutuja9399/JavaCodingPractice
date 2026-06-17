package sdetQACollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_001 {
    public static void main(String[] args) {
        ArrayList <Object> list =new ArrayList<>();
        list.add("Rutu");
        list.add("123");
        list.add("fgnfdkj");
        list.add("^");
        list.add("null");
        list.add("null");
        list.add("null");
        //to get the list of elements
        System.out.println("To print added value : "+list);

        //to get the size
        System.out.println("TO get the size if array: "+list.size());

        //to remove element at particular index
        list.remove(3);
        System.out.println("LIst after remove element: "+list);

        //to insert the element in arraylist
        list.add(2,"yash");
        System.out.println("After insertion arrayList : "+list);
//To modifi specific element
        list.set(3, "python");
        System.out.println("After modification : "+list);
        //to access specific element
        System.out.println("Element at place 3: "+ list.get(4));
        //Reading all element from the list
//
//        for(int i=0; i<list.size() ;i++){
//            System.out.println("Output from for loop: "+list.get(i));
//        }
// for(Object listObj:list){
//     System.out.println("For each loop :"+listObj);

     //print br iterator
//     Iterator<Object> it = new Iterator<>() {
//
//     System.out.println("Iterator");
//     System.out.println(it.hasNext());


    }
}
