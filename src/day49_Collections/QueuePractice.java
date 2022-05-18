package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));  // does NOT keep insertion order

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));     // keeps insertion order

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();         // keeps insertion order
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------");

        //they all have FIFO order!!!
        priorityQueue.poll();       // first element of Queue will be removed
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();       // first element of Queue will be removed
        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------");

//        System.out.println(priorityQueue.get(1));     // error!
//        System.out.println(arrayDeque.get(1));     // error!

//        System.out.println(linkedList.get(1));     // error!
          //but WHY? object type new LinkedList<>() owns get() method! but
          // in Polymorphism, the Reference type "Queue<Integer> linkedList" decides what is accessed!!
          // you can only use what the Reference type has!
          // so, I need to cast -->
//        System.out.println( ( (List)linkedList ).get(1) );    // or use shortcut to cast it -->
        System.out.println(((LinkedList<Integer>) linkedList).get(1));
    }
}
