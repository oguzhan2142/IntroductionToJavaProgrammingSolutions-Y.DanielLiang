package exercise10;

import java.util.PriorityQueue;

public class PerformSetOperationsOnPriorityQueues {


    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("George");
        queue1.add("Jim");
        queue1.add("John");
        queue1.add("Blake");
        queue1.add("Blake");
        queue1.add("Kevin");
        queue1.add("Michael");

        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("Michael");
        queue2.add("Katie");
        queue2.add("Kevin");
        queue2.add("Michelle");
        queue2.add("Ryan");


        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println("union : " + union(queue1, queue2));
        System.out.println("difference : " + difference(queue1, queue2));
        System.out.println("intersection : " + intersection(queue1, queue2));


    }


    private static <T> PriorityQueue<T> union(PriorityQueue<T> q1, PriorityQueue<T> q2) {
        PriorityQueue<T> unionQueue = new PriorityQueue<T>();
        unionQueue.addAll(q1);
        unionQueue.addAll(q2);


        return unionQueue;
    }

    private static <T> PriorityQueue<T> difference(PriorityQueue<T> q1, PriorityQueue<T> q2) {

        PriorityQueue<T> difference = new PriorityQueue<>();
        difference.addAll(q1);
        difference.removeAll(q2);

        return difference;
    }

    private static <T> PriorityQueue<T> intersection(PriorityQueue<T> q1, PriorityQueue<T> q2) {

        PriorityQueue<T> intersection = new PriorityQueue<>();
        intersection.addAll(q1);
        intersection.retainAll(q2);


        return intersection;
    }


}
