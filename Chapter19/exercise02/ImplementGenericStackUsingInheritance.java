package exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplementGenericStackUsingInheritance {

    public static void main(String[] args) {

        System.out.println("Enter five strings:");
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> strings = new GenericStack<String>();
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            strings.add(s);
        }
        scanner.close();

        strings.toString();

    }


    static class GenericStack<E> extends ArrayList<E> {


        public GenericStack() {

        }


        public int getSize() {
            return size();
        }


        public E peek() {
            return (E) get(size() - 1);
        }

        public void push(E o) {

            add(o);

        }

        public E pop() {

            E removed =(E) get(getSize() - 1);
            remove(removed);
            return removed;
        }

        public boolean isEmpty() {
            return getSize() == 0;
        }

        public String toString() {
            return super.toString();
        }
    }
}
