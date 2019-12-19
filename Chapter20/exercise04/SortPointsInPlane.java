package exercise04;

import java.util.ArrayList;
import java.util.Comparator;

public class SortPointsInPlane {

    public static void main(String[] args) {


        ArrayList<Point> points = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            points.add(new Point(Math.random() * 100, Math.random() * 100));
        }

        points.sort(new CompareY());
        System.out.println("According to Y:");
        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i));
        }


        for (int i = 0; i < points.size() - 1; i++) {
            Point p = points.get(i);
            for (int j = i; j < points.size(); j++) {
                Point p2 = points.get(j);

                if (p.compareTo(p2) == 1) {
                    points.set(i, p2);
                    points.set(j, p);
                    break;
                }
            }
        }



        System.out.println("\n\n\nAccording to X:");


        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i));
        }
    }


    static class Point implements Comparable<Point> {

        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x > o.x)
                return 1;
            else if (this.x < o.x)
                return -1;
            else {
                if (this.y > o.y)
                    return 1;
                else if (this.y < o.y)
                    return -1;
                else
                    return 0;
            }
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class CompareY implements Comparator<Point> {


        @Override
        public int compare(Point o1, Point o2) {

            if (o1.y > o2.y)
                return 1;
            else if (o1.y < o2.y)
                return -1;
            else {
                if (o1.x > o2.x)
                    return 1;
                else if (o1.x < o2.x)
                    return -1;
                else
                    return 0;
            }

        }
    }
}
