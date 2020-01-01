package exercise06;

import java.util.*;

public class CountTheOccurrencesOfNumbersEntered {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter numbers:");
        int num = scanner.nextInt();

        while (num != 0) {
            integers.add(num);
            num = scanner.nextInt();
        }


        Iterator<Integer> iterator = integers.iterator();

        Map<Integer, Integer> map = new HashMap<>();

        while (iterator.hasNext()) {

            int next = iterator.next();

            if (map.containsKey(next)) {

                int value = map.get(next);
                value++;
                map.put(next, value);
            } else {
                map.put(next, 0);
            }
        }


        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        int max = 0;

        for (Map.Entry<Integer, Integer> s : set) {

            if (s.getValue() > max)
                max = s.getValue();
        }

        ArrayList<Integer> highest = new ArrayList<>();

        for (Map.Entry<Integer, Integer> s : set) {

            if (s.getValue() == max) {
                highest.add(s.getKey());
            }

        }


        System.out.println("highest keys:" + highest);

    }


}
