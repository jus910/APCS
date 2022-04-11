import java.util.LinkedList;

public class LLQueue<T> implements Queue<T> {
    LinkedList<T> list;
    public LLQueue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T x) { //passthru fx
        list.add(x);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public T peekFront() {
        return list.getFirst();
    }
}