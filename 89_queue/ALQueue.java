import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {
    ArrayList<T> list;
    int headIndex;
    public ALQueue() {
        list = new ArrayList<T>();
        headIndex = 0;
    }

    public void enqueue(T x) { //passthru fx
        list.add(x);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        headIndex++;
        return list.get(headIndex-1);
    }

    public boolean isEmpty() {
        return (list.size()-headIndex == 0);
    }

    public T peekFront() {
        return list.get(headIndex);
    }
}