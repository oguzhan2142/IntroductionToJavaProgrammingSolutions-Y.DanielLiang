package exercise01;

public class GenericStack<E> {

    private E[] list;
    private int size;

    public GenericStack() {

        list = (E[]) new Object[8];
        size = 0;

    }

    public int getSize() {

        return size;

    }

    public E peek() {
        return list[size - 1];
    }

    public void push(E o) {

        if (size == list.length) {

            E[] bigList = (E[]) new Object[list.length * 2];
            System.arraycopy(list, 0, bigList, 0, list.length);
            list = bigList;
        }

        list[size] = o;
        size++;
    }

    public E pop() {

        int returnIndex = size;
        size--;
        return list[returnIndex];
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;

    }


    public String toString() {

        return list.toString();

    }

}
