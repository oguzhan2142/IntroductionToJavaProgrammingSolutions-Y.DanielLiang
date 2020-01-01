package exercise01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PerformSetOperationsOnHashSets {


    public static void main(String[] args) {


        Set<String> set1 = new HashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> set2 = new HashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));

        set2.removeAll(Arrays.asList("Jim", "John", "Blake"));
        set2.add("Katie");
        set2.add("Ryan");


        System.out.println("set1 :" + set1);
        System.out.println("set2 :" + set2);


        System.out.println("union:" + union(set1, set2));
        System.out.println("difference:" + difference(set1, set2));
        System.out.println("common:" + common(set1, set2));


    }


    private static Set<String> union(Set<String> set1, Set<String> set2) {

        Set<String> copySet1 = new HashSet<>();
        copySet1.addAll(set1);

        Set<String> copySet2 = new HashSet<>();
        copySet1.addAll(set2);

        copySet1.addAll(copySet2);

        return copySet1;
    }

    private static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> copySet1 = new HashSet<>();
        copySet1.addAll(set1);

        Set<String> copySet2 = new HashSet<>();
        copySet2.addAll(set2);

        copySet1.removeAll(copySet2);


        return copySet1;
    }

    private static Set<String> common(Set<String> set1, Set<String> set2) {
        Set<String> copySet1 = new HashSet<>();
        copySet1.addAll(set1);

        Set<String> copySet2 = new HashSet<>();
        copySet2.addAll(set2);


        copySet1.retainAll(copySet2);

        return copySet1;
    }

}
