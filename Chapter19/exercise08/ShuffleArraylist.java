package exercise08;

import java.util.ArrayList;

public class ShuffleArraylist {
    public static <E> void shuffle(ArrayList<E> list){

        for (int i = 0; i < list.size(); i++) {

            int randomIndex = (int)(Math.random() * list.size());

            E temp = list.get(i);
            E temp1 = list.get(randomIndex);

            list.set(i , temp1);
            list.set(randomIndex , temp);


        }


    }
}
