package exercise06;

import java.util.Iterator;
import java.util.LinkedList;

public class UseIteratorsOnLinkedlists {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        long now;
        long lastTime;

        for (int i = 0; i < 500_000; i++) {
            linkedList.add(i);
        }


        lastTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {

            linkedList.get(i);

        }
        now = System.currentTimeMillis();
        System.out.println("Elapsed time in get() method : " + (now - lastTime));


        Iterator<Integer> iterator = linkedList.iterator();


        lastTime = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
        }

        now = System.currentTimeMillis();
        System.out.println("Elapsed time in iterator method : " + (now - lastTime));
    }


}
