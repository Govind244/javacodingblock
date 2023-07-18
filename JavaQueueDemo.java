// Java Queue Demo

// import java.util.LinkedList;
// import java.util.Queue;

import java.util.*;

public class JavaQueueDemo{
    
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        // 10 20 30

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q.peek());

        System.out.println(q.size());

        System.out.println(q.isEmpty());

        System.out.println(q);
    }
}
