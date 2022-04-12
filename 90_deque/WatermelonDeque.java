import java.util.LinkedList;

public class WatermelonDeque<T> implements Deque<T> {
    private LinkedList list;

    public WatermelonDeque() {
        list = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public boolean offerFirst(T x) {
        return false;
    }

    public boolean offerLast(T x) {
        return false;
    }

    public T pollFirst() {
        return null;
    }

    public T pollLast() {
        return null;
    }

    public T peekFirst() {
        return null;
    }

    public T peekLast() {
        return null;
    }
    
}
