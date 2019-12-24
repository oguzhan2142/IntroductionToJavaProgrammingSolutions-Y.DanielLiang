package exercise12;

import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{


    public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> temp = new MyPriorityQueue<>();
        temp.addAll((MyPriorityQueue<E>)super.clone());
        return temp;
    }

}
