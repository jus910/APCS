/*
Watermelon: Justin, Anthony, Jomin
apcs pd7
HW90 & HW91: Deque
2022-04-12
time spent: 0.2 hr + class time
*/

import java.util.LinkedList;

public class WatermelonDeque<T> implements Deque<T> {
    private LinkedList<T> list;

    public WatermelonDeque() {
        list = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    } // O(1)

    public boolean offerFirst(T x) {
        list.addFirst(x);
        return true;
    } // O(1)

    public boolean offerLast(T x) {
        list.addLast(x); //add(x) would work as well
        return true;
    } // O(1)

    public T pollFirst() {
        if (isEmpty()) return null;
        return list.removeFirst();
    } // O(1)

    public T pollLast() {
        if (isEmpty()) return null;
        return list.removeLast();
    } // O(1)

    public T peekFirst() {
        if (isEmpty()) return null;
        return list.getFirst();
    } // O(1)

    public T peekLast() {
        if (isEmpty()) return null;
        return list.getLast();
    } // O(1)

    public String toString() {
        String s ="";
        for (T x : list) {
            s+=x+" ";
        }
        return s.substring(0, s.length()-1);
    }

}
