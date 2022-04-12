public interface Deque<T> {
    public boolean isEmpty();
    public boolean offerFirst(T x);
    public boolean offerLast(T x);
    public T pollFirst();
    public T pollLast();
    public T peekFirst();
    public T peekLast();
}