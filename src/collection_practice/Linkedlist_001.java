package collection_practice;

import java.util.LinkedList;

public class Linkedlist_001 {
    public static void main(String[] args) {
        LinkedList<Object> list =new LinkedList<>();
        list.add("yash");
        list.add("Anjum");
        list.add("Rutuja");
        list.add(123);
        list.add("kanchan18");
        list.add(77.5f);
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println("++++++++++++++");

        //methods of linkedlist : peek ,pop, offer, poll
        //peek
        Object p1 = list.peek();
        System.out.println("Peek method :"+p1);//it is used to retrieve the first element and not remove the element

        //peekFirst === it is used to retrieve only first element
        System.out.println( "peekfirstElement method:  "+list.peekFirst());

        //peekLast == retreive last element from linkedlist
        System.out.println("peekLastElemmnt method:  "+list.peekLast());
        System.out.println("++++++++++++++");

        //offer  ==it is same as add element method from list but for
        // linked list it work like list deque method
        //offer, offerfirst , offerlast
        list.offer("velocity");
        System.out.println( list);

        list.offerFirst("pune");
        System.out.println(list );

        list.offerLast("beed");
        System.out.println( list);
        System.out.println("++++++++++++++");

        //poll== it is used to retrieve head and remove the same element
        //when list is empty it will give NULL

        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println("++++++++++++++++++++");

        LinkedList<Object> list1 =new LinkedList<>();
        System.out.println(list1.poll());//it will show null
        System.out.println(list1.peek()); //it will show null
      //  System.out.println(list1.pop());//it will throw NoSuchElementException
        System.out.println("++++++++++++++++++++");
// pop is to used retrive and remove
        System.out.println(list.pop());
        System.out.println(list);

    }
}
