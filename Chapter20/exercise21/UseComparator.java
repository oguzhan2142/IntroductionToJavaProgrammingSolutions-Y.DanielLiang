package exercise21;

import java.util.Arrays;
import java.util.Comparator;

public class UseComparator {
    public static void main(String[] args) {


        GeometricObject[] list = {
                new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5),
                new Circle(0.5), new Rectangle(4, 65),
                new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)
        };


        Comparator<GeometricObject> comparator = new Comparator<GeometricObject>() {
            @Override
            public int compare(GeometricObject o1, GeometricObject o2) {
                if (o1.getArea() > o2.getArea())
                    return 1;
                else if (o1.getArea() < o2.getArea())
                    return -1;
                else
                    return 0;


            }
        };

        selectionSort(list, comparator);
        System.out.println(Arrays.toString(list));

    }


    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if (comparator.compare(list[i], list[j]) < 0) {
                    E temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }


    }
}
